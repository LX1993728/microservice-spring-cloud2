package com.liuxun.cloud.repository;

import com.liuxun.cloud.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao  extends JpaRepository<User,Long> {
    User findByUsername(String username);
}
