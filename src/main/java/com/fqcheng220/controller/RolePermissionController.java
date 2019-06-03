package com.fqcheng220.controller;

import com.fqcheng220.common.constants.ResponseConstants;
import com.fqcheng220.common.constants.UrlPathConstants;
import com.fqcheng220.common.req.BaseRequestAddBody;
import com.fqcheng220.common.req.BaseRequestBody;
import com.fqcheng220.common.req.BaseRequestDelBody;
import com.fqcheng220.common.req.BaseRequestUpdateBody;
import com.fqcheng220.common.resp.BaseResponseBody;
import com.fqcheng220.model.UpmsRolePermission;
import com.fqcheng220.model.UpmsRolePermissionExample;
import com.fqcheng220.service.IBaseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class RolePermissionController {
    private final Logger mLogger = LoggerFactory.getLogger(getClass());
    @Autowired
    private IBaseService<UpmsRolePermission,UpmsRolePermissionExample> upmsService;

    /**
     * 增加角色-权限
     * @param requestBody
     * @return
     */
    @RequestMapping(value = UrlPathConstants.ROLEPERMISSION_ADD,method = RequestMethod.POST)
    @ResponseBody
    public BaseResponseBody addRolePermission(@RequestBody BaseRequestAddBody<UpmsRolePermission> requestBody){
        return BaseController.add(requestBody,UrlPathConstants.ROLEPERMISSION_ADD,upmsService,ResponseConstants.MSG_SUC_ROLEPERMISSION_ADD);
    }

    /**
     * 删除角色-权限
     * @param requestBody
     * @return
     */
    @RequestMapping(value = UrlPathConstants.ROLEPERMISSION_DEL,method = RequestMethod.POST)
    @ResponseBody
    public BaseResponseBody delRolePermission(@RequestBody BaseRequestDelBody requestBody){
        UpmsRolePermissionExample example = new UpmsRolePermissionExample();
        example.createCriteria().andIdIn(requestBody.mEntityList);
        return BaseController.del(requestBody,UrlPathConstants.ROLEPERMISSION_DEL,upmsService,example,ResponseConstants.MSG_SUC_ROLEPERMISSION_DEL);
    }

    /**
     * 更新角色-权限
     * @param requestBody
     * @return
     */
    @RequestMapping(value = UrlPathConstants.ROLEPERMISSION_UPDATE,method = RequestMethod.POST)
    @ResponseBody
    public BaseResponseBody updateRolePermission(@RequestBody BaseRequestUpdateBody<UpmsRolePermission> requestBody){
        return BaseController.update(requestBody,UrlPathConstants.ROLEPERMISSION_UPDATE,upmsService,ResponseConstants.MSG_SUC_ROLEPERMISSION_UPDATE);
    }

    /**
     * 查询角色-权限列表
     * @return
     */
    @RequestMapping(value = UrlPathConstants.ROLEPERMISSION_LIST,method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public BaseResponseBody listAllRolePermission(@RequestBody BaseRequestBody requestBody){
        UpmsRolePermissionExample example = new UpmsRolePermissionExample();
        return BaseController.listAll(requestBody,UrlPathConstants.ROLEPERMISSION_LIST,upmsService,example,ResponseConstants.MSG_SUC_ROLEPERMISSION_LIST);
    }
}
