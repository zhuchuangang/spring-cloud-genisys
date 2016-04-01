package com.szss.genisys.auth.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.approval.ApprovalStore;
import org.springframework.security.oauth2.provider.approval.JdbcApprovalStore;
import org.springframework.security.oauth2.provider.client.ClientDetailsUserDetailsService;
import org.springframework.security.oauth2.provider.client.JdbcClientDetailsService;
import org.springframework.security.oauth2.provider.code.AuthorizationCodeServices;
import org.springframework.security.oauth2.provider.code.JdbcAuthorizationCodeServices;
import org.springframework.security.oauth2.provider.token.DefaultTokenServices;
import org.springframework.security.oauth2.provider.token.store.JdbcTokenStore;

import javax.sql.DataSource;

/**
 * OAuth2认证设置,此处使用的认证管理器AuthenticationManager和web认证中使用认证管理器AuthenticationManager是两个不同的对象
 *
 * @author zcg
 */
@Configuration
@EnableAuthorizationServer
public class OAuth2Config extends AuthorizationServerConfigurerAdapter {
    /**
     * 注入认证管理器AuthenticationManager
     */
    @Autowired
    private AuthenticationManager authenticationManager;

    /**
     * 注入数据源
     */
    @Autowired
    private DataSource dataSource;

    /**
     * 注入加密类,该加密类已经在WebSecurityConfig中定义
     */
    @Autowired
    private PasswordEncoder passwordEncoder;

    /**
     * 存储token值,涉及表为oauth_access_token,oauth_refresh_token
     * 也可使用InMemoryTokenStore存于内存中
     *
     * @return
     */
    @Bean
    public JdbcTokenStore jdbcTokenStore() {
        return new JdbcTokenStore(dataSource);
    }

    /**
     * 存储code,涉及表为oauth_code
     * @return
     */
    @Bean
    protected AuthorizationCodeServices authorizationCodeServices() {
        return new JdbcAuthorizationCodeServices(dataSource);
    }

    /**
     * 从数据库获取client认证信息,涉及表为oauth_client_details,可以提供passwordEncoder校验client_secret
     * @return
     */
    @Bean
    public JdbcClientDetailsService jdbcClientDetailsService() {
        JdbcClientDetailsService service = new JdbcClientDetailsService(dataSource);
        //service.setPasswordEncoder(passwordEncoder);
        return service;
    }

    /**
     * 此bean一定要在configure方法前运行加载，否则将使用默认的tokenServices
     * @return
     */
    @Bean
    @Primary
    public DefaultTokenServices tokenServices() {
        DefaultTokenServices tokenServices = new DefaultTokenServices();
        tokenServices.setSupportRefreshToken(true);
        tokenServices.setTokenStore(jdbcTokenStore());
        tokenServices.setClientDetailsService(jdbcClientDetailsService());
        return tokenServices;
    }

    /**
     * 保存批准信息approval,涉及表oauth_approvals,主要是保存读写等scope的期限
     *
     * @return
     */
    @Bean
    public ApprovalStore approvalStore() {
        return new JdbcApprovalStore(dataSource);
    }

    /**
     * 该类实现了spring security中UserDetailsService接口
     *
     * @return
     */
    @Bean
    public ClientDetailsUserDetailsService oauth2ClientDetailsUserService(){
        ClientDetailsUserDetailsService service=new ClientDetailsUserDetailsService(jdbcClientDetailsService());
        return service;
    }

    /**
     * 设置加密方法
     *
     * @param security
     * @throws Exception
     */
    @Override
    public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
        security//.passwordEncoder(passwordEncoder)
                .tokenKeyAccess("permitAll()") //默认为denyAll()
                .checkTokenAccess("isAuthenticated()"); //默认为denyAll()
    }

    /**
     *
     * We set our authorization storage feature specifying that we would use the
     * JDBC store for token and authorization code storage.<br>
     * <br>
     * <p>
     * We also attach the {@link AuthenticationManager} so that password grants
     * can be processed.
     */
    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
        endpoints.authenticationManager(authenticationManager)
                .authorizationCodeServices(authorizationCodeServices())
                .userDetailsService(oauth2ClientDetailsUserService())
                .tokenStore(jdbcTokenStore())
                .approvalStore(approvalStore());
    }

    /**
     * Setup the client application which attempts to get access to user's account after user permission.
     */
    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        clients.withClientDetails(jdbcClientDetailsService());
    }


}





