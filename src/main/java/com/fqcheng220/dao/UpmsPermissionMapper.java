package com.fqcheng220.dao;

import com.fqcheng220.model.UpmsPermission;
import com.fqcheng220.model.UpmsPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UpmsPermissionMapper {
    long countByExample(UpmsPermissionExample example);

    int deleteByExample(UpmsPermissionExample example);

    int deleteByPrimaryKey(Integer permissionid);

    int insert(UpmsPermission record);

    int insertSelective(UpmsPermission record);

    List<UpmsPermission> selectByExample(UpmsPermissionExample example);

    UpmsPermission selectByPrimaryKey(Integer permissionid);

    int updateByExampleSelective(@Param("record") UpmsPermission record, @Param("example") UpmsPermissionExample example);

    int updateByExample(@Param("record") UpmsPermission record, @Param("example") UpmsPermissionExample example);

    int updateByPrimaryKeySelective(UpmsPermission record);

    int updateByPrimaryKey(UpmsPermission record);
}