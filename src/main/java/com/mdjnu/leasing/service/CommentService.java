package com.mdjnu.leasing.service;

import com.mdjnu.leasing.pojo.Comment;

import java.util.List;

public interface CommentService {
    List<Comment> selectComment(String system, Integer id);

    Boolean insertComment(String userId, String system, String systemId,String commentValue);

    List<Comment> queryAllComment(Integer userId);

    void deleteCommentById (Integer[] commentId);
}
