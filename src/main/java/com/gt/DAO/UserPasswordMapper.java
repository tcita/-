package com.gt.DAO;

import com.gt.POJO.Userpassword;

public interface UserPasswordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Userpassword record);

    int insertSelective(Userpassword record);

    Userpassword selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Userpassword record);

    int updateByPrimaryKey(Userpassword record);

    Userpassword selectByUid(Integer uid);
}