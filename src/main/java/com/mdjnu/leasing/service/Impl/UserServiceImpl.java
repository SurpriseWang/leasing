package com.mdjnu.leasing.service.Impl;

import com.mdjnu.leasing.mapper.*;
import com.mdjnu.leasing.pojo.*;
import com.mdjnu.leasing.service.UserService;
import com.mdjnu.leasing.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired(required = false)
    UserMapper userMapper;
    @Autowired(required = false)
    UserExtendMapper userExtendMapper;
    @Autowired(required = false)
    GoodsMapper goodsMapper;
    @Autowired(required = false)
    HouseMapper houseMapper;
    @Autowired(required = false)
    CommentMapper commentMapper;

    @Override
    public List<User> selectUser(String userName, String userPassword) {
        UserExample ue = new UserExample();
        ue.createCriteria().andUserNameEqualTo(userName).andUserPasswordEqualTo(userPassword);
        List<User> users = userMapper.selectByExample(ue);
        return users;
    }

    @Override
    public Boolean createUser(String userName, String userPassword, String userPhone) {
        User user = new User();
        user.setUserName(userName);
        user.setUserPassword(userPassword);
        user.setUserPhone(userPhone);
        userMapper.insertSelective(user);
        UserExtend userExtend = new UserExtend();
        userExtend.setUserAddress("");
        userExtend.setUserId(String.valueOf(user.getUserId()));
        userExtend.setUserIdCard("");
        userExtendMapper.insertSelective(userExtend);
        return true;
    }

    @Override
    public User selectUserById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public UserVo selectUserExtend(Integer userId) {
        UserExtendExample userExtendExample = new UserExtendExample();
        userExtendExample.createCriteria().andUserIdEqualTo(String.valueOf(userId));
        User user = userMapper.selectByPrimaryKey(userId);
        List<UserExtend> userExtends = userExtendMapper.selectByExample(userExtendExample);
        UserVo userVo = new UserVo();
        userVo.user = user;
        userVo.userExtend = userExtends.get(0);
        return userVo;
    }

    @Override
    public Boolean updataUserExtend(Integer userId, String userNameNew, String userPasswordNew, String userPhoneNew, String userAddressNew, String userIdCardNew) {
        User user = new User();
        user.setUserId(userId);
        user.setUserName(userNameNew);
        user.setUserPhone(userPhoneNew);
        UserExtend userExtend = new UserExtend();
        userExtend.setUserAddress(userAddressNew);
        userExtend.setUserIdCard(userIdCardNew);
        userMapper.updateByPrimaryKeySelective(user);
        userExtendMapper.updateByPrimaryKeySelective(userExtend);
        return true;
    }

    @Override
    public List<User> queryAllUser() {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUserIdIsNotNull();
        return userMapper.selectByExample(userExample);
    }

    @Override
    public void deleteUserById(Integer[] userId) {
        for (int i = 0; i < userId.length; i++) {
            userMapper.deleteByPrimaryKey(userId[i]);
            UserExtendExample userExtendExample = new UserExtendExample();
            userExtendExample.createCriteria().andUserIdEqualTo(userId[i].toString());
            userExtendMapper.deleteByExample(userExtendExample);
            HouseExample houseExample = new HouseExample();
            houseExample.createCriteria().andUserIdEqualTo(userId[i]);
            houseMapper.deleteByExample(houseExample);
            GoodsExample goodsExample = new GoodsExample();
            goodsExample.createCriteria().andUserIdEqualTo(userId[i]);
            goodsMapper.deleteByExample(goodsExample);
            CommentExample commentExample = new CommentExample();
            commentExample.createCriteria().andUserIdEqualTo(userId[i].toString());
            commentMapper.deleteByExample(commentExample);
        }
    }

}
