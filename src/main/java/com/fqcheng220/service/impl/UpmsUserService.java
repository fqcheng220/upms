package com.fqcheng220.service.impl;

import com.fqcheng220.common.constants.ResponseConstants;
import com.fqcheng220.common.resp.BaseResponseBody;
import com.fqcheng220.common.shiro.jwt.JwtUtils;
import com.fqcheng220.dao.UpmsUserMapper;
import com.fqcheng220.model.UpmsUser;
import com.fqcheng220.model.UpmsUserExample;
import com.fqcheng220.service.IUpmsUserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.authz.Permission;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.ExecutionException;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

@Service
public class UpmsUserService /*extends BaseService<UpmsUserMapper,UpmsUser,UpmsUserExample>*/ implements IUpmsUserService {
    @Autowired
    StringRedisTemplate redisTemplate;

    @Override
    public List<UpmsUser> listAllUser() {
        UpmsUserExample example = new UpmsUserExample();
        return mapper.selectByExample(example);
    }

    @Override
    public String generateSalt(String userName) {
        String salt = JwtUtils.generateSalt();
        redisTemplate.opsForSet().add("token:"+userName,salt);
        return salt;
    }

    @Override
    public String getSalt(String userName) {
        return redisTemplate.opsForSet().pop("token:"+userName);
    }

    //    @Override
//    public BaseResponseBody<UpmsUser> login(String userName, String pwd) {
//        BaseResponseBody<UpmsUser> ret = new BaseResponseBody<>();
//        Subject subject = SecurityUtils.getSubject();
//        AuthenticationToken authenticationToken = new UsernamePasswordToken(userName,pwd);
//        try{
//            subject.login(authenticationToken);
//            List<UpmsUser> list = new ArrayList<>();
//            list.add((UpmsUser)subject.getPrincipal());
//            ret.setmStatusCode(ResponseConstants.STATUS_SUC).setmResult(list).setmMsg("");
//        }catch (IncorrectCredentialsException e){
//            ret.setmStatusCode(ResponseConstants.STATUS_FAIL_UNKOWN).setmMsg("密码错误");
//        } catch (LockedAccountException e) {
//            ret.setmStatusCode(ResponseConstants.STATUS_FAIL_UNKOWN).setmMsg("登录失败，该用户已被冻结");
//        } catch (AuthenticationException e) {
//            ret.setmStatusCode(ResponseConstants.STATUS_FAIL_UNKOWN).setmMsg("该用户不存在");
//        } catch (Exception e) {
//            ret.setmStatusCode(ResponseConstants.STATUS_FAIL_UNKOWN);
//            e.printStackTrace();
//        }
//        return ret;
//    }
//
//    @Override
//    public BaseResponseBody loginOut(String userName, String pwd) {
//        return null;
//    }

    @Autowired
    protected UpmsUserMapper mapper;
    @Override
    public long countByExample(UpmsUserExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(UpmsUserExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer userid) {
        return 0;
    }

    @Override
    public int insert(UpmsUser record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(UpmsUser record) {
        return 0;
    }

    @Override
    public List<UpmsUser> selectByExample(UpmsUserExample example) {
        return mapper.selectByExample(example);
    }

    @Override
    public UpmsUser selectByPrimaryKey(Integer userid) {
        return null;
    }

    @Override
    public int updateByExampleSelective(UpmsUser record, UpmsUserExample example) {
        return 0;
    }

    @Override
    public int updateByExample(UpmsUser record, UpmsUserExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(UpmsUser record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(UpmsUser record) {
        return 0;
    }
}
