package com.chx.zhyq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServicePrividerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServicePrividerApplication.class, args);
    }

}
