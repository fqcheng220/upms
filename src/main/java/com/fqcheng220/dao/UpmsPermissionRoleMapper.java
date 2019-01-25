package com.fqcheng220.dao;

import com.fqcheng220.model.UpmsPermissionRole;
import com.fqcheng220.model.UpmsPermissionRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UpmsPermissionRoleMapper {
    long countByExample(UpmsPermissionRoleExample example);

    int deleteByExample(UpmsPermissionRoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UpmsPermissionRole record);

    int insertSelective(UpmsPermissionRole record);

    List<UpmsPermissionRole> selectByExample(UpmsPermissionRoleExample example);

    UpmsPermissionRole selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UpmsPermissionRole record, @Param("example") UpmsPermissionRoleExample example);

    int updateByExample(@Param("record") UpmsPermissionRole record, @Param("example") UpmsPermissionRoleExample example);

    int updateByPrimaryKeySelective(UpmsPermissionRole record);

    int updateByPrimaryKey(UpmsPermissionRole record);
}