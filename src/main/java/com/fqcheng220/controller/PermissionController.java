package com.fqcheng220.controller;

import com.fqcheng220.common.constants.ResponseConstants;
import com.fqcheng220.common.constants.UrlPathConstants;
import com.fqcheng220.common.req.BaseRequestAddBody;
import com.fqcheng220.common.req.BaseRequestBody;
import com.fqcheng220.common.req.BaseRequestDelBody;
import com.fqcheng220.common.req.BaseRequestUpdateBody;
import com.fqcheng220.common.resp.BaseResponseBody;
import com.fqcheng220.model.UpmsPermission;
import com.fqcheng220.model.UpmsPermissionExample;
import com.fqcheng220.service.IBaseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PermissionController {
    private final Logger mLogger = LoggerFactory.getLogger(getClass());
    @Autowired
    private IBaseService<UpmsPermission,UpmsPermissionExample> upmsService;

    /**
     * 增加权限
     * @param requestBody
     * @return
     */
    @RequestMapping(value = UrlPathConstants.PERMISSION_ADD,method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public BaseResponseBody addPermission(@RequestBody BaseRequestAddBody<UpmsPermission> requestBody){
        return BaseController.add(requestBody,UrlPathConstants.PERMISSION_ADD,upmsService,ResponseConstants.MSG_SUC_PERMISSION_ADD);
    }

    /**
     * 删除权限
     * @param requestBody
     * @return
     */
    @RequestMapping(value = UrlPathConstants.PERMISSION_DEL,method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public BaseResponseBody delPermission(@RequestBody BaseRequestDelBody requestBody){
        UpmsPermissionExample example = new UpmsPermissionExample();
        example.createCriteria().andPermissionidIn(requestBody.mEntityList);
        return BaseController.del(requestBody,UrlPathConstants.PERMISSION_DEL,upmsService,example,ResponseConstants.MSG_SUC_PERMISSION_DEL);
    }

    /**
     * 更新权限
     * @param requestBody
     * @return
     */
    @RequestMapping(value = UrlPathConstants.PERMISSION_UPDATE,method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public BaseResponseBody updatePermission(@RequestBody BaseRequestUpdateBody<UpmsPermission> requestBody){
        return BaseController.update(requestBody,UrlPathConstants.PERMISSION_UPDATE,upmsService,ResponseConstants.MSG_SUC_PERMISSION_UPDATE);
    }

    /**
     * 查询权限列表
     * @return
     */
    @RequestMapping(value = UrlPathConstants.PERMISSION_LIST,method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public BaseResponseBody listAllPermission(@RequestBody BaseRequestBody requestBody){
        UpmsPermissionExample example = new UpmsPermissionExample();
        return BaseController.listAll(requestBody,UrlPathConstants.PERMISSION_LIST,upmsService,example,ResponseConstants.MSG_SUC_PERMISSION_LIST);
    }
}
