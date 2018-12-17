package com.fqcheng220.service.impl;

import com.fqcheng220.dao.UpmsUserMapper;
import com.fqcheng220.model.UpmsUser;
import com.fqcheng220.model.UpmsUserExample;
import com.fqcheng220.service.IUpmsUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UpmsUserService /*extends BaseService<UpmsUserMapper,UpmsUser,UpmsUserExample>*/ implements IUpmsUserService {
    @Override
    public List<UpmsUser> listAllUser() {
        UpmsUserExample example = new UpmsUserExample();
        return mapper.selectByExample(example);
    }

    @Autowired
    protected UpmsUserMapper mapper;
    @Override
    public long countByExample(UpmsUserExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(UpmsUserExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer userid) {
        return 0;
    }

    @Override
    public int insert(UpmsUser record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(UpmsUser record) {
        return 0;
    }

    @Override
    public List<UpmsUser> selectByExample(UpmsUserExample example) {
        return mapper.selectByExample(example);
    }

    @Override
    public UpmsUser selectByPrimaryKey(Integer userid) {
        return null;
    }

    @Override
    public int updateByExampleSelective(UpmsUser record, UpmsUserExample example) {
        return 0;
    }

    @Override
    public int updateByExample(UpmsUser record, UpmsUserExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(UpmsUser record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(UpmsUser record) {
        return 0;
    }
}
