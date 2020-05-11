package com.mdjnu.leasing.controlller;

import com.alibaba.fastjson.JSON;
import com.mdjnu.leasing.pojo.User;
import com.mdjnu.leasing.service.UserService;
import com.mdjnu.leasing.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class UserController {
    @Autowired(required = false)
    UserService userService;

    @RequestMapping("/login")
    public String loginUser(HttpServletRequest req, HttpServletResponse resp, String userName, String userPassword) {
        resp.setCharacterEncoding("utf-8");//设置Response的编码方式为UTF-8
        List<User> users = userService.selectUser(userName, userPassword);
        if (users.size() != 0) {
            Cookie cookie = new Cookie("userName", JSON.toJSONString(users.get(0).getUserName()));
            resp.addCookie(cookie);
            cookie = new Cookie("userId", JSON.toJSONString(users.get(0).getUserId()));
            resp.addCookie(new Cookie("userLogin", "true"));
            resp.addCookie(cookie);
            System.out.println(req.getRequestURL());
            return "redirect:Http://localhost:8080/html/index.html";
        } else {
            return "false";
        }
    }

    @RequestMapping("/logout")
    public String logoutUser(HttpServletRequest req, HttpServletResponse resp) {
        Cookie[] cookies = req.getCookies();
        for (Cookie cookie : cookies) {
            String name = cookie.getName();
            if (name.equals("userName") || name.equals("userId")) {
                cookie.setValue(null);
                resp.addCookie(cookie);
            } else {
                if (name.equals("userLogin")) {
                    cookie.setValue("false");
                    resp.addCookie(cookie);
                }
            }
        }
        return "redirect:Http://localhost:8080/html/index.html";
    }

    @RequestMapping("/createUser")
    public String createUser(HttpServletResponse resp, String userName, String userPassword, String userPhone) {
        userService.createUser(userName, userPassword, userPhone);
        return "redirect:Http://localhost:8080/html/index.html";
    }

    @ResponseBody
    @RequestMapping("/selectUserExtend")
    public UserVo selectUserAccount(Integer userId) {
        return userService.selectUserExtend(userId);
    }

    @RequestMapping("/updataUserExtend")
    public String updataUserExtend(Integer userId, String userNameNew, String userPasswordNew, String userPhoneNew, String userAddressNew, String userIdCardNew) {
        userService.updataUserExtend(userId, userNameNew, userPasswordNew, userPhoneNew, userAddressNew, userIdCardNew);
        return "redirect:Http://localhost:8080/html/userExtend.html";
    }
}

