package com.fqcheng220.service;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IBaseService<MODEL,EXAMPLE>{
    long countByExample(EXAMPLE example);

    int deleteByExample(EXAMPLE example);

    int deleteByPrimaryKey(Integer userid);

    int insert(MODEL record);

    int insertSelective(MODEL record);

    List<MODEL> selectByExample(EXAMPLE example);

    MODEL selectByPrimaryKey(Integer userid);

    int updateByExampleSelective(@Param("record") MODEL record, @Param("example") EXAMPLE example);

    int updateByExample(@Param("record") MODEL record, @Param("example") EXAMPLE example);

    int updateByPrimaryKeySelective(MODEL record);

    int updateByPrimaryKey(MODEL record);
}
