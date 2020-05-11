package com.mdjnu.leasing.service;

import com.mdjnu.leasing.pojo.User;
import com.mdjnu.leasing.vo.UserVo;

import java.util.List;

public interface UserService {
    List<User> selectUser(String userName, String userPassword);

    Boolean createUser(String userName, String userPassword, String userPhone);

    User selectUserById(Integer id);

    UserVo selectUserExtend(Integer userId);

    Boolean updataUserExtend(Integer userId, String userNameNew, String userPasswordNew, String userPhoneNew, String userAddressNew, String userIdCardNew);

    List<User> queryAllUser();

    void deleteUserById(Integer[] userId);
}
