package com.szss.genisys.trace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;

/**
 * Created by zcg on 16/3/22.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZipkinStreamServer
public class TraceServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(TraceServiceApplication.class,args);
    }
}
