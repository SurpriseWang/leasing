package com.mdjnu.leasing.pojo;

import java.io.Serializable;

public class UserExtend implements Serializable {
    private Integer userExtendId;

    private String userId;

    private String userAddress;

    private String userIdCard;

    private static final long serialVersionUID = 1L;

    public Integer getUserExtendId() {
        return userExtendId;
    }

    public void setUserExtendId(Integer userExtendId) {
        this.userExtendId = userExtendId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress == null ? null : userAddress.trim();
    }

    public String getUserIdCard() {
        return userIdCard;
    }

    public void setUserIdCard(String userIdCard) {
        this.userIdCard = userIdCard == null ? null : userIdCard.trim();
    }
}