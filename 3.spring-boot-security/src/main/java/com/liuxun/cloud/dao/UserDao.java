package com.liuxun.cloud.dao;

import com.liuxun.cloud.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Long>{
    User findByUsername(String username);
}
