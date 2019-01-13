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

import java.util.List;

public class UpmsRealm extends AuthorizingRealm {
    @Autowired
    private IUpmsUserService upmsUserService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        UpmsUser upmsUser = (UpmsUser) principalCollection.getPrimaryPrincipal();
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String userName = (String) authenticationToken.getPrincipal();
        UpmsUserExample upmsUserExample = new UpmsUserExample();
        UpmsUserExample.Criteria criteria = upmsUserExample.createCriteria();
        criteria.andUsernameEqualTo(userName);
        List<UpmsUser> list = upmsUserService.selectByExample(upmsUserExample);
        if (list == null || list.isEmpty()) {
            return null;
        } else {
            UpmsUser upmsUser = list.get(0);
            SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(upmsUser, upmsUser.getPwd(),  getName());
            return simpleAuthenticationInfo;
        }
    }
}
