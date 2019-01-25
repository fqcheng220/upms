package com.fqcheng220.service;

import com.fqcheng220.common.resp.BaseResponseBody;
import com.fqcheng220.model.UpmsUser;
import com.fqcheng220.model.UpmsUserExample;

import java.util.List;

public interface IUpmsUserService  extends IBaseService<UpmsUser,UpmsUserExample> {
    List<UpmsUser> listAllUser();

//    BaseResponseBody<UpmsUser> login(String userName, String pwd);
//
//    BaseResponseBody loginOut(String userName, String pwd);

    String generateToken(String userName);

    String getTokenSalt(String userName);

    List<String> selectRolesForUser(Integer userId);

    List<String> selectRolesForUser(String userName);
}
