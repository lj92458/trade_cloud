package com.liujun.admin.dao;

import com.liujun.admin.model.UserAccount;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserAccountMapper {
    int deleteByPrimaryKey(String userAccount);

    int insert(UserAccount record);

    int insertSelective(UserAccount record);

    UserAccount selectByPrimaryKey(String userAccount);

    int updateByPrimaryKeySelective(UserAccount record);

    int updateByPrimaryKey(UserAccount record);
    //

    List<UserAccount> selectByConditions(UserAccount params);

    UserAccount selectByAccountAndPassword(@Param("account")String account, @Param("password")String password);
}