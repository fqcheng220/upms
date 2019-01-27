package com.fqcheng220.common.shiro;

import com.fqcheng220.model.UpmsUser;
import com.fqcheng220.model.UpmsUserExample;
import com.fqcheng220.service.IUpmsUserService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class UpmsRealm extends AuthorizingRealm {
    @Autowired
    private IUpmsUserService upmsUserService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        Object object = principalCollection.getPrimaryPrincipal();
        List<String> roleNameList = new ArrayList<>();
        /*if (object instanceof UpmsUser) {
            UpmsUser upmsUser = (UpmsUser) principalCollection.getPrimaryPrincipal();
            roleNameList = upmsUserService.selectRolesForUser(upmsUser.getUserid());
        } else */if (object instanceof String) {
            String userName = (String) principalCollection.getPrimaryPrincipal();
            roleNameList = upmsUserService.selectRolesForUser(userName);
        }
        simpleAuthorizationInfo.addRoles(roleNameList);
        return simpleAuthorizationInfo;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String userName = (String) authenticationToken.getPrincipal();
        UpmsUserExample upmsUserExample = new UpmsUserExample();
        UpmsUserExample.Criteria criteria = upmsUserExample.createCriteria();
        criteria.andUsernameEqualTo(userName);
        List<UpmsUser> list = upmsUserService.selectByExample(upmsUserExample);
        if (list == null || list.isEmpty() || list.get(0) == null) {
            return null;
        } else {
            SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(list.get(0), list.get(0).getPwd(),  getName());
            return simpleAuthenticationInfo;
        }
    }

    @Override
    public boolean supports(AuthenticationToken token) {
        return super.supports(token);
    }
}
