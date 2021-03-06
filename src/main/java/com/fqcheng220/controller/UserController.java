package com.fqcheng220.controller;

import com.fqcheng220.common.constants.ResponseConstants;
import com.fqcheng220.common.constants.UrlPathConstants;
import com.fqcheng220.common.req.*;
import com.fqcheng220.common.req.handler.RequestHandler;
import com.fqcheng220.common.resp.BaseResponseBody;
import com.fqcheng220.model.UpmsUser;
import com.fqcheng220.model.UpmsUserExample;
import com.fqcheng220.service.IUpmsUserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class UserController {
    private final Logger mLogger = LoggerFactory.getLogger(getClass());
    @Autowired
    private IUpmsUserService upmsUserService;

    /**
     * 增加用户
     * @param requestBody
     * @return
     */
    @RequestMapping(value = UrlPathConstants.USER_ADD,method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public BaseResponseBody addUser(@RequestBody BaseRequestAddBody<UpmsUser> requestBody){
        return BaseController.add(requestBody,UrlPathConstants.USER_ADD,upmsUserService,ResponseConstants.MSG_SUC_USER_ADD);
    }

    /**
     * 删除用户
     * @param requestBody
     * @return
     */
    @RequestMapping(value = UrlPathConstants.USER_DEL,method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public BaseResponseBody delUser(@RequestBody BaseRequestDelBody requestBody){
        UpmsUserExample example = new UpmsUserExample();
        example.createCriteria().andUseridIn(requestBody.mEntityList);
        return BaseController.del(requestBody,UrlPathConstants.USER_DEL,upmsUserService,example,ResponseConstants.MSG_SUC_USER_DEL);
    }

    /**
     * 更新用户
     * @param requestBody
     * @return
     */
    @RequestMapping(value = UrlPathConstants.USER_UPDATE,method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public BaseResponseBody updateUser(@RequestBody BaseRequestUpdateBody<UpmsUser> requestBody){
        return BaseController.update(requestBody,UrlPathConstants.USER_UPDATE,upmsUserService,ResponseConstants.MSG_SUC_USER_UPDATE);
    }

    /**
     * 查询用户列表
     * @return
     */
    @RequestMapping(value = UrlPathConstants.USER_LIST,method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public BaseResponseBody listAllUser(@RequestBody BaseRequestBody requestBody){
        UpmsUserExample example = new UpmsUserExample();
        return BaseController.listAll(requestBody,UrlPathConstants.USER_LIST,upmsUserService,example,ResponseConstants.MSG_SUC_USER_LIST);
    }

    @RequestMapping(value = UrlPathConstants.USER_UPDATE_SELF,method = RequestMethod.POST)
    @ResponseBody
    public BaseResponseBody updateUserSelf(@RequestBody UpmsRequestUserUpdate requestBody){
        try{
            //如何直接获取path??
            RequestHandler.handle(UrlPathConstants.USER_UPDATE_SELF,requestBody);
        }catch (Exception e){
            e.printStackTrace();
            return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_FAIL_REQ_VAL).setmMsg(e.getMessage());
        }
        //获取认证token的userName
        String userName = getLoginUserNameForToken();
//        if(userName == null
//                || requestBody == null
//                || requestBody.mUpmsUser == null
//                || !userName.equals(requestBody.mUpmsUser.getUsername())){
//            return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_FAIL_SQL_HANDLE).setmMsg(ResponseConstants.MSG_ERROR_SQL_HANDLE);
//        }
        //参数校验并修正更新userId
        if(requestBody == null || requestBody.mUpmsUser == null){
            return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_FAIL_REQ_ARGS).setmMsg(ResponseConstants.MSG_ERROR_REQ_ARGS);
        }else {
            UpmsUserExample upmsUserExample = new UpmsUserExample();
            upmsUserExample.createCriteria().andUsernameEqualTo(userName);
            List<UpmsUser> list = upmsUserService.selectByExample(upmsUserExample);
            if(list != null && !list.isEmpty()){
                requestBody.mUpmsUser.setUserid(list.get(0).getUserid());
            }else{
                return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_FAIL_SQL_HANDLE).setmMsg(ResponseConstants.MSG_ERROR_SQL_HANDLE);
            }
        }
        int result = -1;
        try{
            result = upmsUserService.updateByPrimaryKey(requestBody.mUpmsUser);
        }catch (Exception e){
            e.printStackTrace();
            return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_FAIL_SQL_HANDLE).setmMsg(e.getLocalizedMessage());
        }
        if(result > 0){
            return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_SUC)
                    .setmMsg(ResponseConstants.MSG_SUC_USER_UPDATE)
                    .setmResult(Arrays.asList(requestBody.mUpmsUser));
        }else{
            return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_FAIL_SQL_HANDLE)
                    .setmMsg(ResponseConstants.MSG_ERROR_SQL_HANDLE);
        }
    }

    /**
     * 查询单个用户
     * @return
     */
//    @RequestMapping(value = "/user/{path}",method = RequestMethod.GET)
//    @ResponseBody
//    public List<UpmsUser> listSingleUser(){
//        return upmsUserService.listAllUser();
//    }


    /**
     * 查询用户
     * @return
     */
    @RequestMapping(value = UrlPathConstants.USER_LIST_SELF,method = RequestMethod.GET)
    @ResponseBody
    public BaseResponseBody listUserSelf(@RequestBody BaseRequestBody requestBody){
        try{
            //如何直接获取path??
            RequestHandler.handle(UrlPathConstants.USER_LIST_SELF,requestBody);
        }catch (Exception e){
            e.printStackTrace();
            return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_FAIL_REQ_VAL).setmMsg(e.getMessage());
        }
        //获取认证token的userName
        String userName = getLoginUserNameForToken();
        UpmsUserExample upmsUserExample = new UpmsUserExample();
        upmsUserExample.createCriteria().andUsernameEqualTo(userName);
        try{
            List<UpmsUser> list =  upmsUserService.selectByExample(upmsUserExample);
            return new BaseResponseBody().setmStatusCode(ResponseConstants.STATUS_SUC)
                    .setmMsg(ResponseConstants.MSG_SUC_USER_LIST)
                    .setmResult(list);
        }catch (Exception e){
            e.printStackTrace();
            return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_FAIL_SQL_HANDLE).setmMsg(e.getLocalizedMessage());
        }
    }

    private String getLoginUserNameForToken(){
        //获取认证token的userName
        Subject subject = SecurityUtils.getSubject();
        //authc认证 principal为userName
        //token认证 更新了principal为UpmsUser对象
        String userName = null;
        Object object = subject.getPrincipals().getPrimaryPrincipal();
        if(object instanceof String){
            userName = (String)object;
        }else if(object instanceof UpmsUser){
            UpmsUser upmsUser = (UpmsUser)object;
            userName = upmsUser.getUsername();
        }
        return userName;
    }
}
