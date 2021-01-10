package com.gt.service;

import com.gt.POJO.Userpassword;

/**
 * Created by wsk1103 on 2017/4/27.
 */
public interface UserPasswordService {
    int deleteByPrimaryKey(Integer id);

    int insert(Userpassword record);

    int insertSelective(Userpassword record);

    Userpassword selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Userpassword record);

    int updateByPrimaryKey(Userpassword record);

    Userpassword selectByUid(Integer uid);
}
