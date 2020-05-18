package com.charon.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


/**
 * @author sl
 */
@SpringBootApplication
@EnableEurekaClient
public class CharonAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(CharonAuthApplication.class, args);
    }

}
