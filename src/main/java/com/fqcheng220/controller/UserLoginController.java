package com.fqcheng220.controller;

import com.fqcheng220.common.constants.ResponseConstants;
import com.fqcheng220.common.constants.UrlPathConstants;
import com.fqcheng220.common.resp.BaseResponseBody;
import com.fqcheng220.dto.UpmsUserDto;
import com.fqcheng220.model.UpmsUser;
import com.fqcheng220.service.IUpmsUserService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

@EnableWebMvc
@EnableSwagger2
@RestController
public class UserLoginController {
    private final Logger mLogger = LoggerFactory.getLogger(getClass());
    @Autowired
    private IUpmsUserService upmsUserService;

    @ApiOperation(httpMethod = "POST",notes = "登录",value = "登录")
    @RequestMapping(value = UrlPathConstants.USER_LOGIN,method = RequestMethod.POST)
    @ResponseBody
    public BaseResponseBody<UpmsUserDto> login(@ApiParam(name="userName",value = "账号",required = true) String userName,
                                               @ApiParam(name="pwd",value = "密码",required = true) String pwd){
        BaseResponseBody<UpmsUserDto> ret = new BaseResponseBody<>();
        Subject subject = SecurityUtils.getSubject();
        AuthenticationToken authenticationToken = new UsernamePasswordToken(userName,pwd);
        try{
            subject.login(authenticationToken);
            UpmsUser upmsUser = (UpmsUser)subject.getPrincipal();
            String token = upmsUserService.generateToken(upmsUser.getUsername());
            UpmsUserDto upmsUserDto = new UpmsUserDto().clone(upmsUser);
            upmsUserDto.setmToken(token);
            List<UpmsUserDto> list = new ArrayList<>();
            list.add(upmsUserDto);
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
