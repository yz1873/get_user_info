package com.chinaunicom.get_user_info.controller;

import com.chinaunicom.get_user_info.bean.UserDO;
import com.chinaunicom.get_user_info.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Optional;

@RestController
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping("/{id}")
    public Optional<UserDO> findById(@PathVariable Long id){
        return userService.findById(id);
    }
}
