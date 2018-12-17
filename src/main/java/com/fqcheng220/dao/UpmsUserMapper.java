package com.fqcheng220.dao;

import com.fqcheng220.model.UpmsUser;
import com.fqcheng220.model.UpmsUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UpmsUserMapper {
    long countByExample(UpmsUserExample example);

    int deleteByExample(UpmsUserExample example);

    int deleteByPrimaryKey(Integer userid);

    int insert(UpmsUser record);

    int insertSelective(UpmsUser record);

    List<UpmsUser> selectByExample(UpmsUserExample example);

    UpmsUser selectByPrimaryKey(Integer userid);

    int updateByExampleSelective(@Param("record") UpmsUser record, @Param("example") UpmsUserExample example);

    int updateByExample(@Param("record") UpmsUser record, @Param("example") UpmsUserExample example);

    int updateByPrimaryKeySelective(UpmsUser record);

    int updateByPrimaryKey(UpmsUser record);
}