package com.fqcheng220.dao;

import com.fqcheng220.model.UpmsUserRoleExample;
import com.fqcheng220.model.UpmsUserRoleKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UpmsUserRoleMapper {
    long countByExample(UpmsUserRoleExample example);

    int deleteByExample(UpmsUserRoleExample example);

    int deleteByPrimaryKey(UpmsUserRoleKey key);

    int insert(UpmsUserRoleKey record);

    int insertSelective(UpmsUserRoleKey record);

    List<UpmsUserRoleKey> selectByExample(UpmsUserRoleExample example);

    int updateByExampleSelective(@Param("record") UpmsUserRoleKey record, @Param("example") UpmsUserRoleExample example);

    int updateByExample(@Param("record") UpmsUserRoleKey record, @Param("example") UpmsUserRoleExample example);
}