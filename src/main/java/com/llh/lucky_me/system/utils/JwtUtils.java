package com.llh.lucky_me.system.utils;

import cn.hutool.core.util.StrUtil;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.auth0.jwt.interfaces.JWTVerifier;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

public class JwtUtils {
    @Autowired

    //发放token
    public static String createToken(String username, String secret, long expireTime) {
        Date date = new Date(System.currentTimeMillis() + expireTime);
        Algorithm algorithm = Algorithm.HMAC256(secret);
        String token = JWT.create()
                .withIssuer(username)
                .withExpiresAt(date)
                .sign(algorithm);
        return token;
    }

    //验证token
    public static Boolean verifyToken(String token, String username, String secret) {
        Algorithm algorithm = Algorithm.HMAC256(secret);
        JWTVerifier verifier = JWT.require(algorithm)
                .withIssuer(username)
                .build();
        DecodedJWT jwt = verifier.verify(token);
        if (StrUtil.isNotBlank(jwt.getToken())) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        //String token = createToken("llh", "123", 5 * 60 * 1000/*5分钟*/);
        //System.out.print(token);

        String token ="eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJsbGgiLCJleHAiOjE1NDc1NTMwNTd9.MBQm1lYVSuocdaGM4XVjE27sNgP_jdpy8fJ97tXfVJQ";
        Boolean result = verifyToken(token,"llh","123");
        System.out.print(result);
    }

}
