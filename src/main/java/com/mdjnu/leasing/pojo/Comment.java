package com.mdjnu.leasing.pojo;

import java.io.Serializable;

public class Comment implements Serializable {
    private Integer commentId;

    private String userId;

    private String commentUseSystem;

    private Integer commentPointSystemId;

    private String commentContent;

    private static final long serialVersionUID = 1L;

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getCommentUseSystem() {
        return commentUseSystem;
    }

    public void setCommentUseSystem(String commentUseSystem) {
        this.commentUseSystem = commentUseSystem == null ? null : commentUseSystem.trim();
    }

    public Integer getCommentPointSystemId() {
        return commentPointSystemId;
    }

    public void setCommentPointSystemId(Integer commentPointSystemId) {
        this.commentPointSystemId = commentPointSystemId;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent == null ? null : commentContent.trim();
    }
}