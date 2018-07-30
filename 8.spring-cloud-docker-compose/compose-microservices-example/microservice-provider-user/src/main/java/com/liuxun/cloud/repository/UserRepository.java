package com.liuxun.cloud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.liuxun.cloud.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
