package com.fqcheng220.common.shiro.jwt;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.credential.CredentialsMatcher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.UnsupportedEncodingException;

public class JWTCredentialsMatcher implements CredentialsMatcher {
    private final Logger mLogger = LoggerFactory.getLogger(getClass());
    @Override
    public boolean doCredentialsMatch(AuthenticationToken authenticationToken, AuthenticationInfo authenticationInfo) {
        try{
            String token = (String)authenticationToken.getCredentials();
            String userName = (String)authenticationInfo.getPrincipals().getPrimaryPrincipal();
            String salt = (String)authenticationInfo.getCredentials();
            mLogger.info("doCredentialsMatch:userName="+userName+",token="+token+",salt="+salt);
            Algorithm algorithm = Algorithm.HMAC256(salt);
            JWTVerifier jwtVerifier = JWT.require(algorithm).withClaim("username",userName).build();
            jwtVerifier.verify(token);
            return true;
        }catch (JWTVerificationException e) {
            e.printStackTrace();
        }
        return false;
    }
}
