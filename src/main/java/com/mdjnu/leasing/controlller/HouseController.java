package com.mdjnu.leasing.controlller;

import com.mdjnu.leasing.pojo.House;
import com.mdjnu.leasing.service.CommentService;
import com.mdjnu.leasing.service.HouseService;
import com.mdjnu.leasing.service.UserService;
import com.mdjnu.leasing.vo.HouseSearchByIdVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HouseController {
    @Autowired(required = false)
    HouseService houseService;
    @Autowired(required = false)
    UserService userService;
    @Autowired(required = false)
    CommentService commentService;

    @RequestMapping("/homeHouse")
    @ResponseBody
    public List<House> selectHomeSpacesHouse() throws Exception {
        List<House> houses = new ArrayList<>();
        List<House> houses1 = houseService.selectHomeSpacesHouse();
        for (int i = 0; i < 4; i++) {
            houses.add(houses1.remove(0));
        }
        return houses;
    }

    @RequestMapping("/homeHouses")
    @ResponseBody
    public List<House> selectHomeSpacesHouses() throws Exception {
        return houseService.selectHomeSpacesHouse();
    }

    @RequestMapping("/searchHouse")
    @ResponseBody
    public List<House> searchHouse(String address, String houseAreaMin, String houseAreaMax, String use, String houseMoneyMin, String houseMoneyMax) {
        System.out.println(address + houseAreaMin + houseAreaMax + use + houseMoneyMin + houseMoneyMax);
        return houseService.searchHouse(address, houseAreaMin, houseAreaMax, use, houseMoneyMin, houseMoneyMax);
    }

    @RequestMapping("/searchEsHouse")
    @ResponseBody
    public List<House> searchEsHouse(String search) throws Exception {
        search = java.net.URLDecoder.decode(search, "UTF-8");
        return houseService.searchESHouse(search);
    }

    @RequestMapping("/searchHouseBySearch")
    @ResponseBody
    public List<House> searchHouseBySearch(String search, String address, String houseAreaMin, String houseAreaMax, String use, String houseMoneyMin, String houseMoneyMax) throws Exception {
        search = java.net.URLDecoder.decode(search, "UTF-8");
        return houseService.searchHouseBySearch(search, address, houseAreaMin, houseAreaMax, use, houseMoneyMin, houseMoneyMax);
    }

    @RequestMapping("/searchHouseById")
    @ResponseBody
    public HouseSearchByIdVo searchHouseById(Integer houseId) throws Exception {
        HouseSearchByIdVo vo = new HouseSearchByIdVo();
        vo.house = houseService.searchHouseById(houseId).get(0);
        vo.user = userService.selectUserById(vo.house.getUserId());
        vo.comment = commentService.selectComment("house", vo.house.getHouseId());
        return vo;
    }

    @ResponseBody
    @RequestMapping("/selectUserHouse")
    public List<House> selectUserHouse(Integer userId) {
        return houseService.selectUserHouse(userId);
    }

    @RequestMapping("/deleteUserHouse")
    public String deleteUserHouse(Integer[] houseId) {
        for (Integer houseIds : houseId) {
            houseService.deleteHouseById(houseIds);
        }
        return "redirect:Http://localhost:8080/html/userHouse.html";
    }

    @RequestMapping("/insertUserHouse")
    public String insertUserHouse(HttpServletRequest request, House house) {
        Cookie[] cookies = request.getCookies();
        Integer userId = 0;
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("userId")) {
                userId = Integer.valueOf(cookie.getValue());
            }
        }
        house.setUserId(userId);
        house.setHousePhoto("127.0.0.1:8080/file/" + house.getHousePhoto());
        houseService.insertHouse(house);
        return "redirect:Http://localhost:8080/html/userHouse.html";
    }
}
