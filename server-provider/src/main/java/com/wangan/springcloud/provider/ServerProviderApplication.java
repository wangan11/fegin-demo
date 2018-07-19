package com.wangan.springcloud.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ServerProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerProviderApplication.class,args);
    }

}
