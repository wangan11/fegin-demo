package com.wangan.springcloud.client.controller;

import com.wangan.springcloud.serverapi.domin.User;
import com.wangan.springcloud.serverapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController implements UserService {

    @Autowired
    private UserService userService;

    @Override
    public void saveUser(User user) {
        userService.saveUser(user);
    }

    @Override
    public List<User> getUser() {
        return userService.getUser();
    }
}
