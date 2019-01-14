package com.fqcheng220.common.shiro.jwt;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;

import java.util.Date;

public class JwtUtils {
    /**
     * 生成随机盐,长度32位
     *
     * @return
     */
    public static String generateSalt() {
        SecureRandomNumberGenerator secureRandom = new SecureRandomNumberGenerator();
        String hex = secureRandom.nextBytes(16).toHex();
        return hex;
    }

    public static String getUserName(String token) {
        DecodedJWT decodedJWT = JWT.decode(token);
        decodedJWT.getClaim("username").asString();
    }

    public static String sign(String userName, String salt, long time) {
        Date date = new Date(System.currentTimeMillis() + time);
        Algorithm algorithm = Algorithm.HMAC256(salt);
        return JWT.create().withClaim("username", userName).withExpiresAt(date).withIssuedAt(new Date()).sign(algorithm);
    }
}
