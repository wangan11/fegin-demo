package com.wangan.springcloud.client;

import com.wangan.springcloud.serverapi.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableFeignClients(clients = UserService.class)
@RibbonClient("server-provider")
public class ConsumerClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerClientApplication.class,args);
    }

}
