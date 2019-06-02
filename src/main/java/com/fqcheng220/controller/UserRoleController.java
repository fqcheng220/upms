package com.fqcheng220.controller;

import com.fqcheng220.common.constants.ResponseConstants;
import com.fqcheng220.common.constants.UrlPathConstants;
import com.fqcheng220.common.req.*;
import com.fqcheng220.common.resp.BaseResponseBody;
import com.fqcheng220.model.*;
import com.fqcheng220.service.IBaseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserRoleController {
    private final Logger mLogger = LoggerFactory.getLogger(getClass());
    @Autowired
    private IBaseService<UpmsUserRole,UpmsUserRoleExample> upmsService;

    /**
     * 增加用户-角色
     * @param requestBody
     * @return
     */
    @RequestMapping(value = UrlPathConstants.USERROLE_ADD,method = RequestMethod.POST)
    @ResponseBody
    public BaseResponseBody addUserRole(@RequestBody BaseRequestAddBody<UpmsUserRole> requestBody){
        return BaseController.add(requestBody,UrlPathConstants.USERROLE_ADD,upmsService,ResponseConstants.MSG_SUC_USERROLE_ADD);
    }

    /**
     * 删除用户-角色
     * @param requestBody
     * @return
     */
    @RequestMapping(value = UrlPathConstants.USERROLE_DEL,method = RequestMethod.POST)
    @ResponseBody
    public BaseResponseBody delUserRole(@RequestBody BaseRequestDelBody requestBody){
        UpmsUserRoleExample example = new UpmsUserRoleExample();
        example.createCriteria().andIdIn(requestBody.mEntityList);
        return BaseController.del(requestBody,UrlPathConstants.USERROLE_DEL,upmsService,example,ResponseConstants.MSG_SUC_USERROLE_DEL);
    }

    /**
     * 更新用户-角色
     * @param requestBody
     * @return
     */
    @RequestMapping(value = UrlPathConstants.USERROLE_UPDATE,method = RequestMethod.POST)
    @ResponseBody
    public BaseResponseBody updateUserRole(@RequestBody BaseRequestUpdateBody<UpmsUserRole> requestBody){
        return BaseController.update(requestBody,UrlPathConstants.USERROLE_UPDATE,upmsService,ResponseConstants.MSG_SUC_USERROLE_UPDATE);
    }

    /**
     * 查询用户-角色列表
     * @return
     */
    @RequestMapping(value = UrlPathConstants.USERROLE_LIST,method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public BaseResponseBody listAllUserRole(@RequestBody BaseRequestBody requestBody){
        UpmsUserRoleExample example = new UpmsUserRoleExample();
        return BaseController.listAll(requestBody,UrlPathConstants.USERROLE_LIST,upmsService,example,ResponseConstants.MSG_SUC_USERROLE_LIST);
    }
}
