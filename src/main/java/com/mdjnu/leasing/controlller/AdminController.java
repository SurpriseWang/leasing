package com.mdjnu.leasing.controlller;

import com.mdjnu.leasing.pojo.*;
import com.mdjnu.leasing.service.*;
import com.mdjnu.leasing.vo.CommentInUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@Controller
public class AdminController {
    @Autowired(required = false)
    AdminService adminService;
    @Autowired(required = false)
    UserService userService;
    @Autowired(required = false)
    GoodsService goodsService;
    @Autowired(required = false)
    HouseService houseService;
    @Autowired(required = false)
    CommentService commentService;

    @RequestMapping("/adminLoginC")
    public String adminLogin(HttpServletResponse resp, String adminName, String adminPassword) {
        List<Admin> admins = adminService.adminLogin(adminName, adminPassword);
        if (admins.size() != 0) {
            Admin admin = admins.get(0);
            resp.addCookie(new Cookie("adminId", admin.getAdminId().toString()));
            resp.addCookie(new Cookie("adminName", admin.getAdminName()));
            return "redirect:Http://localhost:8080/html/adminIndex.html";
        }
        return "redirect:Http://localhost:8080/html/adminLogin.html";
    }

    @ResponseBody
    @RequestMapping("/queryAllUser")
    public List<User> queryAllUser() {
        return userService.queryAllUser();
    }

    @ResponseBody
    @RequestMapping("/queryAllGoods")
    public List<Goods> queryAllGoods() {
        return goodsService.queryAllGoods();
    }


    @ResponseBody
    @RequestMapping("/queryAllHouse")
    public List<House> queryAllHouse() {
        return houseService.queryAllHouse();
    }

    @ResponseBody
    @RequestMapping("/queryAllComment")
    public List<CommentInUser> queryAllComment() {
        List<CommentInUser> commentInUsers = new ArrayList<>();
        List<User> users = userService.queryAllUser();
        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            CommentInUser commentInUser = new CommentInUser();
            commentInUser.user = user;
            commentInUser.comments = commentService.queryAllComment(user.getUserId());
            commentInUsers.add(commentInUser);
        }
        return commentInUsers;
    }

    @RequestMapping("deleteUsersById")
    public String deleteUsersById(Integer[] userId) {
        userService.deleteUserById(userId);
        return "redirect:Http://localhost:8080/html/adminIndex.html";

    }

    @RequestMapping("deleteGoodsById")
    public String deleteGoodsById(Integer[] goodsId) {
        for (int i = 0; i < goodsId.length; i++) {
            goodsService.deleteGoods(goodsId[i]);
        }
        return "redirect:Http://localhost:8080/html/adminIndex.html";

    }

    @RequestMapping("deleteHouseById")
    public String deleteHouseById(Integer[] houseId) {
        for (int i = 0; i < houseId.length; i++) {
            houseService.deleteHouseById(houseId[i]);
        }
        return "redirect:Http://localhost:8080/html/adminIndex.html";

    }

    @RequestMapping("deleteCommentById")
    public String deleteCommentById(Integer[] commentId) {
        commentService.deleteCommentById(commentId);
        return "redirect:Http://localhost:8080/html/adminIndex.html";
    }
}
