package com.fqcheng220.controller;

import com.fqcheng220.common.constants.ResponseConstants;
import com.fqcheng220.common.constants.UrlPathConstants;
import com.fqcheng220.common.req.*;
import com.fqcheng220.common.req.handler.RequestHandler;
import com.fqcheng220.common.resp.BaseResponseBody;
import com.fqcheng220.model.UpmsRole;
import com.fqcheng220.model.UpmsRoleExample;
import com.fqcheng220.service.IBaseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class RoleController {
    private final Logger mLogger = LoggerFactory.getLogger(getClass());
    @Autowired
    private IBaseService<UpmsRole,UpmsRoleExample> upmsRoleService;

    /**
     * 增加角色
     * @param requestBody
     * @return
     */
    @RequestMapping(value = UrlPathConstants.ROLE_ADD,method = RequestMethod.POST)
    @ResponseBody
    public BaseResponseBody addRole(@RequestBody UpmsRequestRoleAdd requestBody){
        try{
            //如何直接获取path??
            RequestHandler.handle(UrlPathConstants.ROLE_ADD,requestBody);
        }catch (Exception e){
            e.printStackTrace();
            return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_FAIL_REQ_VAL).setmMsg(e.getMessage());
        }
        int result = -1;
        try{
            result = upmsRoleService.insert(requestBody.mUpmsRole);
        }catch (Exception e){
            e.printStackTrace();
            return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_FAIL_SQL_HANDLE).setmMsg(e.getLocalizedMessage());
        }
        if(result > 0){
            return new BaseResponseBody<>()
                    .setmStatusCode(ResponseConstants.STATUS_SUC)
                    .setmMsg(ResponseConstants.MSG_SUC_USER_ADD)
                    .setmResult(Arrays.asList(requestBody.mUpmsRole));
        }else{
            return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_FAIL_SQL_HANDLE).setmMsg(ResponseConstants.MSG_ERROR_SQL_HANDLE);
        }
    }

    /**
     * 删除角色
     * @param requestBody
     * @return
     */
    @RequestMapping(value = UrlPathConstants.ROLE_DEL,method = RequestMethod.POST)
    @ResponseBody
    public BaseResponseBody delRole(@RequestBody UpmsRequestRoleDel requestBody){
        try{
            //如何直接获取path??
            RequestHandler.handle(UrlPathConstants.ROLE_DEL,requestBody);
        }catch (Exception e){
            e.printStackTrace();
            return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_FAIL_REQ_VAL).setmMsg(e.getMessage());
        }
        int result = -1;
        try{
            UpmsRoleExample upmsRoleExample = new UpmsRoleExample();
            upmsRoleExample.createCriteria().andRoleidIn(requestBody.mRoleIdList);
            result = upmsRoleService.deleteByExample(upmsRoleExample);
        }catch (Exception e){
            e.printStackTrace();
            return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_FAIL_SQL_HANDLE).setmMsg(e.getLocalizedMessage());
        }
        if(result > 0){
            return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_SUC)
                    .setmMsg(ResponseConstants.MSG_SUC_USER_DEL);
        }else{
            return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_FAIL_SQL_HANDLE).setmMsg(ResponseConstants.MSG_ERROR_SQL_HANDLE);
        }
    }

    /**
     * 更新角色
     * @param requestBody
     * @return
     */
    @RequestMapping(value = UrlPathConstants.ROLE_UPDATE,method = RequestMethod.POST)
    @ResponseBody
    public BaseResponseBody updateRole(@RequestBody UpmsRequestRoleUpdate requestBody){
        try{
            //如何直接获取path??
            RequestHandler.handle(UrlPathConstants.ROLE_UPDATE,requestBody);
        }catch (Exception e){
            e.printStackTrace();
            return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_FAIL_REQ_VAL).setmMsg(e.getMessage());
        }
        int result = -1;
        try{
            result = upmsRoleService.updateByPrimaryKey(requestBody.mUpmsRole);
        }catch (Exception e){
            e.printStackTrace();
            return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_FAIL_SQL_HANDLE).setmMsg(e.getLocalizedMessage());
        }
        if(result > 0){
            return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_SUC)
                    .setmMsg(ResponseConstants.MSG_SUC_USER_UPDATE)
                    .setmResult(Arrays.asList(requestBody.mUpmsRole));
        }else{
            return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_FAIL_SQL_HANDLE).setmMsg(ResponseConstants.MSG_ERROR_SQL_HANDLE);
        }
    }

    /**
     * 查询角色列表
     * @return
     */
    @RequestMapping(value = UrlPathConstants.ROLE_LIST,method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public BaseResponseBody listAllRole(@RequestBody BaseRequestBody requestBody){
        try{
            //如何直接获取path??
            RequestHandler.handle(UrlPathConstants.ROLE_LIST,requestBody);
        }catch (Exception e){
            e.printStackTrace();
            return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_FAIL_REQ_VAL).setmMsg(e.getMessage());
        }
        try{
            UpmsRoleExample upmsRoleExample = new UpmsRoleExample();
            List<UpmsRole> list =  upmsRoleService.selectByExample(upmsRoleExample);
            return new BaseResponseBody().setmStatusCode(ResponseConstants.STATUS_SUC)
                    .setmMsg(ResponseConstants.MSG_SUC_USER_LIST)
                    .setmResult(list);
        }catch (Exception e){
            e.printStackTrace();
            return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_FAIL_SQL_HANDLE).setmMsg(e.getLocalizedMessage());
        }
    }
}
