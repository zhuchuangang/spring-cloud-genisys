package com.szss.genisys.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zcg on 16/2/28.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableHystrixDashboard
@Controller
public class HystrixDashboardApplication {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboardApplication.class,args);
    }

    @RequestMapping("/")
    public String dashboard(){
        return "forward:/hystrix";
    }

}
