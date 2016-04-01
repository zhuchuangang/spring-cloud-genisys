package com.szss.genisys.auth.config;

import com.szss.genisys.auth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.StandardPasswordEncoder;

/**
 * web安全设置,此处使用的认证管理器AuthenticationManager和OAuth2认证中使用认证管理器AuthenticationManager是两个不同的对象
 *
 * @author zcg
 */
@Configuration
@EnableWebSecurity
@Order(-20)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    /**
     * 注入UserService,根据用户名查询用户基础信息和权限
     */
    @Autowired
    private UserService userService;

    /**
     * 创建加密类,可以使用hmac或者BCrypt加密方式,此处使用SHA-256
     *
     * @return
     */
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new StandardPasswordEncoder();
    }

    /**
     * 创建认证支持类,主要作用是判断密码是否合法,此处使用DaoAuthenticationProvider,需要提供UserDetailsService和PasswordEncoder
     *
     * @return
     */
    @Bean
    public AuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
        provider.setUserDetailsService(userService);
        provider.setPasswordEncoder(passwordEncoder());
        return provider;
    }

    /**
     * 构建认证管理器AuthenticationManager,AuthenticationManagerBuilder提供很多方法来构建认证管理器,
     * 包括通过内存和数据库获取认证信息,也可以使用认证支持类AuthenticationProvider做跟复杂的认证,
     * 支持多个认证支持类AuthenticationProvider
     *
     * @param auth
     * @throws Exception
     */
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(authenticationProvider());
    }

    /**
     * 设置http请求过滤条件,此处设置登录界面/login的权限为permitAll
     *
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.formLogin().loginPage("/login").permitAll()
            .and().requestMatchers().antMatchers("/login", "/oauth/authorize", "/oauth/confirm_access")
            .and().authorizeRequests().anyRequest().authenticated();
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/webjars/**").antMatchers("/**/**.css");
    }
}
