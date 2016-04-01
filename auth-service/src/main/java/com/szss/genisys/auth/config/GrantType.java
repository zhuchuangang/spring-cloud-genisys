package com.szss.genisys.auth.config;

import org.springframework.security.crypto.password.StandardPasswordEncoder;

/**
 * Description : TODO()
 * User: h819
 * Date: 2015/12/15
 * Time: 10:30
 * To change this template use File | Settings | File Templates.
 */
public class GrantType {

    public static final String AUTHORIZATION_CODE ="authorization_code";
    public static final String IMPLICIT ="implicit";
    public static final String CLIENT_CREDENTIALS ="client_credentials";
    public static final String PASSWORD ="password";
    public static final String REFRESH_TOKEN ="refresh_token";

//    public static void main(String[] args) {
//        StandardPasswordEncoder encoder=new StandardPasswordEncoder();
//        System.out.print(encoder.encode("123456"));
//    }
}
