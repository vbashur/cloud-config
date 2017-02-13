package com.vbashur.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Lab4ServerApplication {


    public static void main(String[] args) {
        SpringApplication.run(Lab4ServerApplication.class, args);
    }


}
