package com.chinaunicom.get_user_info.service;

import com.chinaunicom.get_user_info.bean.UserDO;
import com.chinaunicom.get_user_info.dao.UserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Optional;

@Service
public class UserService {
    @Resource
    private UserDao userDao;

    public Optional<UserDO> findById(Long id){
        return userDao.findById(id);
    }
}
