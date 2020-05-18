package com.charon.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author zgrj
 */
@SpringBootApplication
@EnableEurekaServer
public class CharonEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CharonEurekaApplication.class, args);
    }

}
