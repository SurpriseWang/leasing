package com.mdjnu.leasing.pojo;

import java.io.Serializable;

public class House implements Serializable {
    private Integer houseId;

    private Integer userId;

    private String houseAddress;

    private String houseCardNumber;

    private Float houseArea;

    private Integer houseSell;

    private Float houseSellMoney;

    private Integer houseLease;

    private Float houseLeaseMoney;

    private String housePhoto;

    private String houseDescribe;

    private static final long serialVersionUID = 1L;

    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getHouseAddress() {
        return houseAddress;
    }

    public void setHouseAddress(String houseAddress) {
        this.houseAddress = houseAddress == null ? null : houseAddress.trim();
    }

    public String getHouseCardNumber() {
        return houseCardNumber;
    }

    public void setHouseCardNumber(String houseCardNumber) {
        this.houseCardNumber = houseCardNumber == null ? null : houseCardNumber.trim();
    }

    public Float getHouseArea() {
        return houseArea;
    }

    public void setHouseArea(Float houseArea) {
        this.houseArea = houseArea;
    }

    public Integer getHouseSell() {
        return houseSell;
    }

    public void setHouseSell(Integer houseSell) {
        this.houseSell = houseSell;
    }

    public Float getHouseSellMoney() {
        return houseSellMoney;
    }

    public void setHouseSellMoney(Float houseSellMoney) {
        this.houseSellMoney = houseSellMoney;
    }

    public Integer getHouseLease() {
        return houseLease;
    }

    public void setHouseLease(Integer houseLease) {
        this.houseLease = houseLease;
    }

    public Float getHouseLeaseMoney() {
        return houseLeaseMoney;
    }

    public void setHouseLeaseMoney(Float houseLeaseMoney) {
        this.houseLeaseMoney = houseLeaseMoney;
    }

    public String getHousePhoto() {
        return housePhoto;
    }

    public void setHousePhoto(String housePhoto) {
        this.housePhoto = housePhoto == null ? null : housePhoto.trim();
    }

    public String getHouseDescribe() {
        return houseDescribe;
    }

    public void setHouseDescribe(String houseDescribe) {
        this.houseDescribe = houseDescribe == null ? null : houseDescribe.trim();
    }
}