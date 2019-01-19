package com.fqcheng220.common.shiro.jwt;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.credential.CredentialsMatcher;

public class JWTCredentialsMatcher implements CredentialsMatcher {
    @Override
    public boolean doCredentialsMatch(AuthenticationToken authenticationToken, AuthenticationInfo authenticationInfo) {
        String token = (String)authenticationToken.getCredentials();
        String userName = (String)authenticationInfo.getPrincipals().getPrimaryPrincipal();
        String salt = (String)authenticationInfo.getCredentials();
        Algorithm algorithm = Algorithm.HMAC256(salt);
        JWTVerifier jwtVerifier = JWT.require(algorithm).withClaim("username",userName).build();
        jwtVerifier.verify(token);
        return true;
    }
}
