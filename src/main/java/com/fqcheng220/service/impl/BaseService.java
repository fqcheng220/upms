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
        return mapper.countByExample(example);
    }

    @Override
    public int deleteByExample(Example example) {
        return mapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer userid) {
        return mapper.deleteByPrimaryKey(userid);
    }

    @Override
    public int insert(Model record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(Model record) {
        return mapper.insertSelective(record);
    }

    @Override
    public List<Model> selectByExample(Example example) {
        return mapper.selectByExample(example);
    }

    @Override
    public Model selectByPrimaryKey(Integer userid) {
        return mapper.selectByPrimaryKey(userid);
    }

    @Override
    public int updateByExampleSelective(Model record, Example example) {
        return mapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(Model record, Example example) {
        return mapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(Model record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Model record) {
        return mapper.updateByPrimaryKey(record);
    }
}
