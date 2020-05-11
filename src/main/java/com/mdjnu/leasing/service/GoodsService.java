package com.mdjnu.leasing.service;

import com.mdjnu.leasing.pojo.Goods;

import java.util.List;

public interface GoodsService {
    List<Goods> homeGoods() throws Exception;

    List<Goods> searchGoodsById(Integer goodsId);

    List<Goods> searchEsGoods(String search) throws Exception;

    void insertGoods(Goods goods);

    void deleteGoods(Integer goodsId);

    List<Goods> selectUserGoods(Integer userId);

    List<Goods> queryAllGoods();
}
