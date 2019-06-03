package com.fqcheng220.controller;

import com.fqcheng220.common.constants.ResponseConstants;
import com.fqcheng220.common.constants.UrlPathConstants;
import com.fqcheng220.common.req.*;
import com.fqcheng220.common.resp.BaseResponseBody;
import com.fqcheng220.model.UpmsRole;
import com.fqcheng220.model.UpmsRoleExample;
import com.fqcheng220.service.IBaseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class RoleController {
    private final Logger mLogger = LoggerFactory.getLogger(getClass());
    @Autowired
    private IBaseService<UpmsRole,UpmsRoleExample> upmsService;

    /**
     * 增加角色
     * @param requestBody
     * @return
     */
    @RequestMapping(value = UrlPathConstants.ROLE_ADD,method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public BaseResponseBody addRole(@RequestBody BaseRequestAddBody<UpmsRole> requestBody){
        return BaseController.add(requestBody,UrlPathConstants.ROLE_ADD,upmsService,ResponseConstants.MSG_SUC_ROLE_ADD);
    }

    /**
     * 删除角色
     * @param requestBody
     * @return
     */
    @RequestMapping(value = UrlPathConstants.ROLE_DEL,method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public BaseResponseBody delRole(@RequestBody BaseRequestDelBody requestBody){
        UpmsRoleExample example = new UpmsRoleExample();
        example.createCriteria().andRoleidIn(requestBody.mEntityList);
        return BaseController.del(requestBody,UrlPathConstants.ROLE_DEL,upmsService,example,ResponseConstants.MSG_SUC_ROLE_DEL);
    }

    /**
     * 更新角色
     * @param requestBody
     * @return
     */
    @RequestMapping(value = UrlPathConstants.ROLE_UPDATE,method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public BaseResponseBody updateRole(@RequestBody BaseRequestUpdateBody<UpmsRole> requestBody){
        return BaseController.update(requestBody,UrlPathConstants.ROLE_UPDATE,upmsService,ResponseConstants.MSG_SUC_ROLE_UPDATE);
    }

    /**
     * 查询角色列表
     * @return
     */
    @RequestMapping(value = UrlPathConstants.ROLE_LIST,method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public BaseResponseBody listAllRole(@RequestBody BaseRequestBody requestBody){
        UpmsRoleExample example = new UpmsRoleExample();
        return BaseController.listAll(requestBody,UrlPathConstants.ROLE_LIST,upmsService,example,ResponseConstants.MSG_SUC_ROLE_LIST);
    }
}
