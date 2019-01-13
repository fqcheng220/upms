package com.fqcheng220.controller;

import com.fqcheng220.common.constants.ResponseConstants;
import com.fqcheng220.common.constants.UrlPathConstants;
import com.fqcheng220.common.req.BaseRequestBody;
import com.fqcheng220.common.req.UpmsRequestUserAdd;
import com.fqcheng220.common.req.UpmsRequestUserDel;
import com.fqcheng220.common.req.UpmsRequestUserUpdate;
import com.fqcheng220.common.req.handler.RequestHandler;
import com.fqcheng220.common.resp.BaseResponseBody;
import com.fqcheng220.common.resp.BaseResponseBodyNew;
import com.fqcheng220.model.UpmsUser;
import com.fqcheng220.service.IUpmsUserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
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
            return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_SUC);
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
            return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_SUC);
        }else{
            return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_FAIL_SQL_HANDLE).setmMsg(ResponseConstants.MSG_ERROR_SQL_HANDLE);
        }
    }

    /**
     * 更新用户
     * @param requestBody
     * @return
     */
    @RequestMapping(value = "/user/update",method = RequestMethod.POST)
    @ResponseBody
    public BaseResponseBody delUser(@RequestBody UpmsRequestUserUpdate requestBody){
        try{
            //如何直接获取path??
            RequestHandler.handle(UrlPathConstants.USER_UPDATE,requestBody);
        }catch (Exception e){
            e.printStackTrace();
            return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_FAIL_REQ_VAL).setmMsg(e.getMessage());
        }
        int result = upmsUserService.updateByPrimaryKey(requestBody.mUpmsUser);
        if(result > 0){
            return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_SUC);
        }else{
            return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_FAIL_SQL_HANDLE).setmMsg(ResponseConstants.MSG_ERROR_SQL_HANDLE);
        }
    }

    /**
     * 查询单个用户
     * @return
     */
    @RequestMapping(value = "/user/{path}",method = RequestMethod.GET)
    @ResponseBody
    public List<UpmsUser> listUser(){
        return upmsUserService.listAllUser();
    }

    /**
     * 查询用户列表
     * @return
     */
    @RequestMapping(value = "/user/list/all",method = RequestMethod.GET)
    @ResponseBody
    public BaseResponseBody listAllUser(@RequestBody BaseRequestBody requestBody){
        try{
            //如何直接获取path??
            RequestHandler.handle(UrlPathConstants.USER_LIST,requestBody);
        }catch (Exception e){
            e.printStackTrace();
//            return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_FAIL_REQ_VAL).setmMsg(e.getMessage());
        }
        List<UpmsUser> list =  upmsUserService.listAllUser();
        return new BaseResponseBody().setmStatusCode(ResponseConstants.STATUS_SUC).setmResult(list);
    }

    @RequestMapping(value = "/user/login",method = RequestMethod.POST)
    @ResponseBody
    public BaseResponseBody<UpmsUser> login(String userName, String pwd){
        BaseResponseBody<UpmsUser> ret = new BaseResponseBody<>();
        Subject subject = SecurityUtils.getSubject();
        AuthenticationToken authenticationToken = new UsernamePasswordToken(userName,pwd);
        try{
            subject.login(authenticationToken);
            List<UpmsUser> list = new ArrayList<>();
            UpmsUser upmsUser = (UpmsUser)subject.getPrincipal();
            list.add(upmsUser);
            ret.setmStatusCode(ResponseConstants.STATUS_SUC).setmResult(list).setmMsg("登录成功");
        }catch (IncorrectCredentialsException e){
            ret.setmStatusCode(ResponseConstants.STATUS_FAIL_UNKOWN).setmMsg("密码错误");
            e.printStackTrace();
        } catch (LockedAccountException e) {
            ret.setmStatusCode(ResponseConstants.STATUS_FAIL_UNKOWN).setmMsg("登录失败，该用户已被冻结");
            e.printStackTrace();
        } catch (AuthenticationException e) {
            ret.setmStatusCode(ResponseConstants.STATUS_FAIL_UNKOWN).setmMsg("该用户不存在");
            e.printStackTrace();
        } catch (Exception e) {
            ret.setmStatusCode(ResponseConstants.STATUS_FAIL_UNKOWN).setmMsg("未知错误");
            e.printStackTrace();
        }
        return ret;
    }
}
