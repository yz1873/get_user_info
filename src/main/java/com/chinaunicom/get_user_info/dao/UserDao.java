package com.chinaunicom.get_user_info.dao;

import com.chinaunicom.get_user_info.bean.UserDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<UserDO, Long> {
}
