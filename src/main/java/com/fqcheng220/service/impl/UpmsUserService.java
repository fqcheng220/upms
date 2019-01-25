package com.fqcheng220.service.impl;

import com.fqcheng220.common.constants.ResponseConstants;
import com.fqcheng220.common.resp.BaseResponseBody;
import com.fqcheng220.common.shiro.jwt.JwtUtils;
import com.fqcheng220.dao.UpmsRoleMapper;
import com.fqcheng220.dao.UpmsUserMapper;
import com.fqcheng220.dao.UpmsUserRoleMapper;
import com.fqcheng220.model.*;
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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    private final Logger mLogger = LoggerFactory.getLogger(getClass());
    @Autowired
    StringRedisTemplate redisTemplate;
    @Autowired
    protected UpmsUserRoleMapper upmsUserRoleMapper;
    @Autowired
    protected UpmsRoleMapper upmsRoleMapper;

    @Override
    public List<UpmsUser> listAllUser() {
        UpmsUserExample example = new UpmsUserExample();
        return mapper.selectByExample(example);
    }

    @Override
    public String generateToken(String userName) {
        String salt = JwtUtils.generateSalt();
        redisTemplate.opsForValue().set("token:"+userName,salt);
        int defaultTimeout = 3600*1000;//ms单位
        String token = JwtUtils.sign(userName,salt,defaultTimeout);
        mLogger.info("generateToken:token="+token+",salt="+salt);
        return token;
    }

    @Override
    public String getTokenSalt(String userName) {
        String salt = redisTemplate.opsForValue().get("token:"+userName);
        mLogger.info("getTokenSalt:userName="+userName+",salt="+salt);
        return salt;
    }

    @Override
    public List<String> selectRolesForUser(Integer userId) {
        UpmsUserRoleExample upmsUserRoleExample = new UpmsUserRoleExample();
        upmsUserRoleExample.createCriteria().andUseridEqualTo(userId);
        List<UpmsUserRole> list = upmsUserRoleMapper.selectByExample(upmsUserRoleExample);

        List<String> roleNameList = new ArrayList<>();
        if(list != null){
            for(UpmsUserRole upmsUserRole:list){
                Integer roleId = upmsUserRole.getRoleid();
                UpmsRoleExample upmsRoleExample = new UpmsRoleExample();
                upmsRoleExample.createCriteria().andRoleidEqualTo(roleId);
                List<UpmsRole> listRole = upmsRoleMapper.selectByExample(upmsRoleExample);
                if(listRole != null && !list.isEmpty()){
                    roleNameList.add(listRole.get(0).getName());
                }
            }
        }
        return roleNameList;
    }

    @Override
    public List<String> selectRolesForUser(String userName) {
        if (userName != null) {
            UpmsUserExample upmsUserExample = new UpmsUserExample();
            upmsUserExample.createCriteria().andUsernameEqualTo(userName);
            List<UpmsUser> upmsUserList = selectByExample(upmsUserExample);
            if(upmsUserList != null && !upmsUserList.isEmpty()){
                UpmsUser upmsUser = upmsUserList.get(0);
                if(upmsUser != null){
                    return selectRolesForUser(upmsUser.getUserid());
                }
            }
        }
        return null;
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
