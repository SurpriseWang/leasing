package com.mdjnu.leasing.controlller;

import com.mdjnu.leasing.mapper.GoodsMapper;
import com.mdjnu.leasing.pojo.Goods;
import com.mdjnu.leasing.service.CommentService;
import com.mdjnu.leasing.service.GoodsService;
import com.mdjnu.leasing.service.UserService;
import com.mdjnu.leasing.vo.GoodsSearchByIdVo;
import com.mdjnu.leasing.vo.HouseSearchByIdVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class GoodsController {
    @Autowired(required = false)
    GoodsService goodsService;
    @Autowired(required = false)
    UserService userService;
    @Autowired(required = false)
    CommentService commentService;

    @ResponseBody
    @RequestMapping("/homeGoods")
    public List<Goods> homeGoods() throws Exception {
        List<Goods> goodses = new ArrayList<>();
        List<Goods> goods = goodsService.homeGoods();
        for (int i = 0; i < 3; i++) {
            goodses.add(goods.get(i));
        }
        return goodses;
    }

    @RequestMapping("/searchGoodsById")
    @ResponseBody
    public GoodsSearchByIdVo searchGoodsById(Integer goodsId) throws Exception {
        GoodsSearchByIdVo vo = new GoodsSearchByIdVo();
        vo.goods = goodsService.searchGoodsById(goodsId).get(0);
        vo.user = userService.selectUserById(vo.goods.getUserId());
        vo.comment = commentService.selectComment("goods", vo.goods.getGoodsId());
        return vo;
    }

    @ResponseBody
    @RequestMapping("/homeGoodses")
    public List<Goods> homeGoodses() throws Exception {
        return goodsService.homeGoods();
    }

    @ResponseBody
    @RequestMapping("/searchEsGoods")
    public List<Goods> searchGoods(String search) throws Exception {
        search = java.net.URLDecoder.decode(search, "UTF-8");
        return goodsService.searchEsGoods(search);
    }

    @RequestMapping("/deletetUserGoods")
    public String deletetUserGoods(HttpServletRequest request, Integer[] goodsId) {
        for (Integer goodsIdOne : goodsId) {
            goodsService.deleteGoods(goodsIdOne);
        }
        return "redirect:Http://localhost:8080/html/userGoods.html";
    }

    @ResponseBody
    @RequestMapping("/selectUserGoods")
    public List<Goods> selectUserGoods(HttpServletRequest request, Integer userId) {
        return goodsService.selectUserGoods(userId);
    }

    @RequestMapping("/insertUserGoods")
    public String insertUserGoods(HttpServletRequest request,Goods goods) {
        Cookie[] cookies = request.getCookies();
        Integer userId = 0;
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("userId")) {
                userId = Integer.valueOf(cookie.getValue());
            }
        }
        goods.setUserId(userId);
        goods.setGoodsPhoto("127.0.0.1:8080/file/" + goods.getGoodsPhoto());
        goodsService.insertGoods(goods);
        return "redirect:Http://localhost:8080/html/userHouse.html";
    }
}
