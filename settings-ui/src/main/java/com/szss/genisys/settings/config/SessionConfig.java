package com.szss.genisys.settings.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.session.web.http.HeaderHttpSessionStrategy;

/**
 * Created by zcg on 16/4/7.
 */
@Configuration
@EnableRedisHttpSession
public class SessionConfig {
    @Bean
    HeaderHttpSessionStrategy sessionStrategy() {
      return new HeaderHttpSessionStrategy();
    }
}
