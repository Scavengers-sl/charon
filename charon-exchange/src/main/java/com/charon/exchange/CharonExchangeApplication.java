package com.charon.exchange;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


/**
 * @author zgrj
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
//@EnableEurekaClient
//@EnableFeignClients
public class CharonExchangeApplication {

    public static void main(String[] args) {
        SpringApplication.run(CharonExchangeApplication.class, args);
    }

}
