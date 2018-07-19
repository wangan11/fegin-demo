package com.wangan.springcloud.provider.service;

import com.wangan.springcloud.serverapi.domin.User;
import com.wangan.springcloud.serverapi.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;
@Service(value = "userviceImp")
public class UserviceImp implements UserService {

    private List<User> userList=new ArrayList<>();

    @Override
    public void saveUser(@RequestBody User user) {
        userList.add(user);
    }

    @Override
    public List<User> getUser() {
        return userList;
    }
}
