package com.mdjnu.leasing.service.Impl;

import com.mdjnu.leasing.mapper.CommentMapper;
import com.mdjnu.leasing.pojo.Comment;
import com.mdjnu.leasing.pojo.CommentExample;
import com.mdjnu.leasing.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired(required = false)
    CommentMapper commentMapper;

    @Override
    public List<Comment> selectComment(String system, Integer id) {
        CommentExample commentExample = new CommentExample();
        commentExample.createCriteria().andCommentUseSystemEqualTo(system).andCommentPointSystemIdEqualTo(Integer.valueOf(id));
        return commentMapper.selectByExample(commentExample);
    }

    @Override
    public Boolean insertComment(String userId, String system, String systemId, String commentValue) {
        Comment comment = new Comment();
        comment.setUserId(userId);
        comment.setCommentUseSystem(system);
        comment.setCommentPointSystemId(Integer.valueOf(systemId));
        comment.setCommentContent(commentValue);
        if (commentMapper.insert(comment) == 1) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public List<Comment> queryAllComment(Integer userId) {
        CommentExample commentExample = new CommentExample();
        commentExample.createCriteria().andUserIdEqualTo(userId.toString());
        return commentMapper.selectByExample(commentExample);
    }

    @Override
    public void deleteCommentById(Integer[] commentId) {
        for (int i = 0; i < commentId.length; i++) {
            commentMapper.deleteByPrimaryKey(commentId[i]);
        }
    }
}
