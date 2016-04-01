package com.szss.genisys.turbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * Created by zcg on 16/2/29.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableTurbine
public class TurbineApplication {
    public static void main(final String[] args) {
        SpringApplication.run(TurbineApplication.class, args);
    }
}
