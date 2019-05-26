package com.fqcheng220.controller;

import com.fqcheng220.common.constants.ResponseConstants;
import com.fqcheng220.common.constants.UrlPathConstants;
import com.fqcheng220.common.req.BaseRequestBody;
import com.fqcheng220.common.req.UpmsRequestUserAdd;
import com.fqcheng220.common.req.UpmsRequestUserDel;
import com.fqcheng220.common.req.UpmsRequestUserUpdate;
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
    public BaseResponseBody addUser(@RequestBody UpmsRequestUserAdd requestBody){
        try{
            //如何直接获取path??
            RequestHandler.handle(UrlPathConstants.USER_ADD,requestBody);
        }catch (Exception e){
            e.printStackTrace();
            return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_FAIL_REQ_VAL).setmMsg(e.getMessage());
        }
        int result = upmsUserService.insert(requestBody.mUpmsUser);
        if(result > 0){
            return new BaseResponseBody<>()
                    .setmStatusCode(ResponseConstants.STATUS_SUC)
                    .setmMsg(ResponseConstants.MSG_SUC_ADD)
                    .setmResult(Arrays.asList(requestBody.mUpmsUser));
        }else{
            return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_FAIL_SQL_HANDLE).setmMsg(ResponseConstants.MSG_ERROR_SQL_HANDLE);
        }
    }

    /**
     * 删除用户
     * @param requestBody
     * @return
     */
    @RequestMapping(value = UrlPathConstants.USER_DEL,method = RequestMethod.POST)
    @ResponseBody
    public BaseResponseBody delUser(@RequestBody UpmsRequestUserDel requestBody){
        try{
            //如何直接获取path??
            RequestHandler.handle(UrlPathConstants.USER_DEL,requestBody);
        }catch (Exception e){
            e.printStackTrace();
            return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_FAIL_REQ_VAL).setmMsg(e.getMessage());
        }
        int result = upmsUserService.deleteByPrimaryKey(requestBody.mUserId);
        if(result > 0){
            return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_SUC)
                    .setmMsg(ResponseConstants.MSG_SUC_DEL)
                    .setmResult(Arrays.asList(requestBody.mUserId));
        }else{
            return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_FAIL_SQL_HANDLE).setmMsg(ResponseConstants.MSG_ERROR_SQL_HANDLE);
        }
    }

    /**
     * 更新用户
     * @param requestBody
     * @return
     */
    @RequestMapping(value = UrlPathConstants.USER_UPDATE,method = RequestMethod.POST)
    @ResponseBody
    public BaseResponseBody updateUser(@RequestBody UpmsRequestUserUpdate requestBody){
        try{
            //如何直接获取path??
            RequestHandler.handle(UrlPathConstants.USER_UPDATE,requestBody);
        }catch (Exception e){
            e.printStackTrace();
            return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_FAIL_REQ_VAL).setmMsg(e.getMessage());
        }
        int result = upmsUserService.updateByPrimaryKey(requestBody.mUpmsUser);
        if(result > 0){
            return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_SUC)
                    .setmMsg(ResponseConstants.MSG_SUC_UPDATE)
                    .setmResult(Arrays.asList(requestBody.mUpmsUser));
        }else{
            return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_FAIL_SQL_HANDLE).setmMsg(ResponseConstants.MSG_ERROR_SQL_HANDLE);
        }
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
        int result = upmsUserService.updateByPrimaryKey(requestBody.mUpmsUser);
        if(result > 0){
            return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_SUC)
                    .setmMsg(ResponseConstants.MSG_SUC_UPDATE)
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
        List<UpmsUser> list =  upmsUserService.selectByExample(upmsUserExample);
        return new BaseResponseBody().setmStatusCode(ResponseConstants.STATUS_SUC)
                .setmMsg(ResponseConstants.MSG_SUC_LIST)
                .setmResult(list);
    }

    /**
     * 查询用户列表
     * @return
     */
    @RequestMapping(value = UrlPathConstants.USER_LIST,method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public BaseResponseBody listAllUser(@RequestBody BaseRequestBody requestBody){
        try{
            //如何直接获取path??
            RequestHandler.handle(UrlPathConstants.USER_LIST,requestBody);
        }catch (Exception e){
            e.printStackTrace();
            return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_FAIL_REQ_VAL).setmMsg(e.getMessage());
        }
        List<UpmsUser> list =  upmsUserService.listAllUser();
        return new BaseResponseBody().setmStatusCode(ResponseConstants.STATUS_SUC)
                .setmMsg(ResponseConstants.MSG_SUC_LIST)
                .setmResult(list);
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
