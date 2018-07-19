package com.wangan.springcloud.serverapi.service;

import com.wangan.springcloud.serverapi.domin.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@FeignClient("server-provider")
public interface UserService {

     @PostMapping("/saveUser")
     void saveUser(User user);

     @GetMapping("/getUser")
     List<User> getUser();

}
