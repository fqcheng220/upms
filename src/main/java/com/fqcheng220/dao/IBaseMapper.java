package com.fqcheng220.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IBaseMapper<Model,Example> {
    long countByExample(Example example);

    int deleteByExample(Example example);

    int deleteByPrimaryKey(Integer roleid);

    int insert(Model record);

    int insertSelective(Model record);

    List<Model> selectByExample(Example example);

    Model selectByPrimaryKey(Integer roleid);

    int updateByExampleSelective(@Param("record") Model record, @Param("example") Example example);

    int updateByExample(@Param("record") Model record, @Param("example") Example example);

    int updateByPrimaryKeySelective(Model record);

    int updateByPrimaryKey(Model record);
}
