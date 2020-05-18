package com.charon.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author sl
 */
@SpringBootApplication
@EnableEurekaClient
@EnableOAuth2Sso
public class CharonGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(CharonGatewayApplication.class, args);
    }

}
