package com.mdjnu.leasing.service.Impl;

import com.mdjnu.leasing.mapper.GoodsMapper;
import com.mdjnu.leasing.pojo.Goods;
import com.mdjnu.leasing.pojo.GoodsExample;
import com.mdjnu.leasing.pojo.House;
import com.mdjnu.leasing.service.GoodsService;
import com.mdjnu.leasing.utils.EsUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired(required = false)
    GoodsMapper goodsMapper;

    @Override
    public List<Goods> homeGoods() throws Exception {
        GoodsExample goodsExample = new GoodsExample();
        goodsExample.createCriteria().andGoodsIdIsNotNull();
        List<Goods> goodses = goodsMapper.selectByExample(goodsExample);
        EsUtils es = new EsUtils();
        for (Goods goods : goodses
        ) {
            if (es.createGoodsEs(goods.getGoodsId().toString())) {
                es.createGoodsEs(goods);
            }
        }
        return goodses;
    }

    @Override
    public List<Goods> searchGoodsById(Integer goodsId) {
        GoodsExample goodsExample = new GoodsExample();
        goodsExample.createCriteria().andGoodsIdEqualTo(goodsId);
        return goodsMapper.selectByExample(goodsExample);
    }

    @Override
    public List<Goods> searchEsGoods(String search) throws Exception {
        EsUtils es = new EsUtils();
        List<Integer> esId = es.searchGoodsEs(search);
        GoodsExample goodsExample = new GoodsExample();
        goodsExample.createCriteria().andGoodsIdIn(esId);
        return goodsMapper.selectByExample(goodsExample);
    }

    @Override
    public void insertGoods(Goods goods) {
        goodsMapper.insertSelective(goods);
    }

    @Override
    public void deleteGoods(Integer goodsId) {
        goodsMapper.deleteByPrimaryKey(goodsId);
    }

    @Override
    public List<Goods> selectUserGoods(Integer userId) {
        GoodsExample goodsExample = new GoodsExample();
        goodsExample.createCriteria().andUserIdEqualTo(userId);
        return goodsMapper.selectByExample(goodsExample);
    }

    @Override
    public List<Goods> queryAllGoods() {
        GoodsExample goodsExample = new GoodsExample();
        goodsExample.createCriteria().andUserIdIsNotNull();
        return goodsMapper.selectByExample(goodsExample);
    }


}
