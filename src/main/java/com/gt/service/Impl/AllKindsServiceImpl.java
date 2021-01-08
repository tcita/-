package com.gt.service.Impl;

import com.gt.DAO.AllKindsMapper;
import com.gt.POJO.AllKinds;
import com.gt.service.AllKindsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


//在Java开发中，通常将后台分成几层，常见的是三层mvc：model、view、controller，模型视图控制层三层，
// 而impl通常处于controller层的service下，用来存放接口的实现类，impl的全称为implement，表示实现的意思。

@Service
public class AllKindsServiceImpl implements AllKindsService {
    @Resource
    private AllKindsMapper allKindsMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(AllKinds record) {
        return allKindsMapper.insert(record);
    }

    @Override
    public int insertSelective(AllKinds record) {
        return allKindsMapper.insertSelective(record);
    }

    @Override
    public AllKinds selectByPrimaryKey(Integer id) {
        return allKindsMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(AllKinds record) {
        return allKindsMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(AllKinds record) {
        return allKindsMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<AllKinds> selectAll() {
        return allKindsMapper.selectAll();
    }
}
