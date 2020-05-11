package com.mdjnu.leasing.controlller;

import com.mdjnu.leasing.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class CommentController {
    @Autowired(required = false)
    CommentService commentService;

    @ResponseBody
    @RequestMapping("/createHouseComment")
    public Boolean createHouseComment(HttpServletRequest req, String commentValue) {
        Cookie[] cookies = req.getCookies();
        String userId = "";
        String system = "";
        String houseId = "";
        for (Cookie cookie : cookies) {
            String name = cookie.getName();
            switch (name) {
                case "userId":
                    userId = cookie.getValue();
                    continue;
                case "system":
                    system = cookie.getValue();
                    continue;
                case "houseId":
                    houseId = cookie.getValue();
                    continue;
            }
        }
        return commentService.insertComment(userId, system, houseId, commentValue);
    }

    @ResponseBody
    @RequestMapping("/createGoodsComment")
    public Boolean createGoodsComment(HttpServletRequest req, String commentValue) {
        Cookie[] cookies = req.getCookies();
        String userId = "";
        String system = "";
        String houseId = "";
        for (Cookie cookie : cookies) {
            String name = cookie.getName();
            switch (name) {
                case "userId":
                    userId = cookie.getValue();
                    continue;
                case "system":
                    system = cookie.getValue();
                    continue;
                case "goodsId":
                    houseId = cookie.getValue();
                    continue;
            }
        }
        return commentService.insertComment(userId, system, houseId, commentValue);
    }
}