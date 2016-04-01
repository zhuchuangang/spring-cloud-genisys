package com.szss.genisys.auth.config;

import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zcg on 16/3/22.
 */
@Configuration
public class TraceConfig {
    @Bean
    public AlwaysSampler defaultSampler() {
        return new AlwaysSampler();
    }
}
