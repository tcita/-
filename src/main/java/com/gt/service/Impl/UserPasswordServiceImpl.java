package com.gt.service.Impl;

import com.gt.DAO.UserPasswordMapper;
import com.gt.POJO.Userpassword;
import com.gt.service.UserPasswordService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service("userPasswordService")
public class UserPasswordServiceImpl implements UserPasswordService{
    @Resource
    private
    UserPasswordMapper userPasswordMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(Userpassword record) {
        return userPasswordMapper.insert(record);
    }

    @Override
    public int insertSelective(Userpassword record) {
        return userPasswordMapper.insertSelective(record);
    }

    @Override
    public Userpassword selectByPrimaryKey(Integer id) {
        return userPasswordMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Userpassword record) {
        return userPasswordMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Userpassword record) {
        return userPasswordMapper.updateByPrimaryKey(record);
    }

    @Override
    public Userpassword selectByUid(Integer uid) {
        return this.userPasswordMapper.selectByUid(uid);
    }
}
