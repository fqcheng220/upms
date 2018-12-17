package com.fqcheng220.service.impl;

import com.fqcheng220.dao.IBaseMapper;
import com.fqcheng220.service.IBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public class BaseService<Mapper extends IBaseMapper<Model,Example>,Model,Example> implements IBaseService<Model,Example> {
    @Autowired
    protected Mapper mapper;
    @Override
    public long countByExample(Example example) {
        return 0;
    }

    @Override
    public int deleteByExample(Example example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer userid) {
        return 0;
    }

    @Override
    public int insert(Model record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(Model record) {
        return 0;
    }

    @Override
    public List<Model> selectByExample(Example example) {
        return mapper.selectByExample(example);
    }

    @Override
    public Model selectByPrimaryKey(Integer userid) {
        return null;
    }

    @Override
    public int updateByExampleSelective(Model record, Example example) {
        return 0;
    }

    @Override
    public int updateByExample(Model record, Example example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Model record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Model record) {
        return 0;
    }
}
