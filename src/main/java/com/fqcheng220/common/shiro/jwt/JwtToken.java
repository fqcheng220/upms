package com.fqcheng220.common.shiro.jwt;

import org.apache.shiro.authc.AuthenticationToken;

public class JwtToken implements AuthenticationToken {

    public JwtToken(String token){
        mToken = token;
    }
    public String getmToken() {
        return mToken;
    }

    public void setmToken(String mToken) {
        this.mToken = mToken;
    }

    private String mToken;
    @Override
    public Object getPrincipal() {
        return null;
    }

    /**
     * 此处必须返回mToken 参看#JWTCredentialsMatcher.doCredentialsMatch
     * @return
     */
    @Override
    public Object getCredentials() {
        return mToken;
    }
}
