package com.szss.genisys.platform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 
 * @author Filip Lindby
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PlatformServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlatformServiceApplication.class, args);
    }
}
