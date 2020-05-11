package com.mdjnu.leasing.mapper;

import com.mdjnu.leasing.pojo.UserExtend;
import com.mdjnu.leasing.pojo.UserExtendExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserExtendMapper {
    int countByExample(UserExtendExample example);

    int deleteByExample(UserExtendExample example);

    int deleteByPrimaryKey(Integer userExtendId);

    int insert(UserExtend record);

    int insertSelective(UserExtend record);

    List<UserExtend> selectByExample(UserExtendExample example);

    UserExtend selectByPrimaryKey(Integer userExtendId);

    int updateByExampleSelective(@Param("record") UserExtend record, @Param("example") UserExtendExample example);

    int updateByExample(@Param("record") UserExtend record, @Param("example") UserExtendExample example);

    int updateByPrimaryKeySelective(UserExtend record);

    int updateByPrimaryKey(UserExtend record);
}