package com.mdjnu.leasing.pojo;

import java.io.Serializable;

public class Goods implements Serializable {
    private Integer goodsId;

    private Integer userId;

    private String goodsDescribe;

    private String goodsSell;

    private Float goodsSellMoney;

    private String goodsPhoto;

    private static final long serialVersionUID = 1L;

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getGoodsDescribe() {
        return goodsDescribe;
    }

    public void setGoodsDescribe(String goodsDescribe) {
        this.goodsDescribe = goodsDescribe == null ? null : goodsDescribe.trim();
    }

    public String getGoodsSell() {
        return goodsSell;
    }

    public void setGoodsSell(String goodsSell) {
        this.goodsSell = goodsSell == null ? null : goodsSell.trim();
    }

    public Float getGoodsSellMoney() {
        return goodsSellMoney;
    }

    public void setGoodsSellMoney(Float goodsSellMoney) {
        this.goodsSellMoney = goodsSellMoney;
    }

    public String getGoodsPhoto() {
        return goodsPhoto;
    }

    public void setGoodsPhoto(String goodsPhoto) {
        this.goodsPhoto = goodsPhoto == null ? null : goodsPhoto.trim();
    }
}