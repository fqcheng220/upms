package com.fqcheng220.service;

import com.fqcheng220.model.UpmsUser;
import com.fqcheng220.model.UpmsUserExample;

import java.util.List;

public interface IUpmsUserService  extends IBaseService<UpmsUser,UpmsUserExample> {
    List<UpmsUser> listAllUser();
}
