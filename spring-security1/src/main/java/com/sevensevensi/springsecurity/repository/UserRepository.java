package com.sevensevensi.springsecurity.repository;

import com.sevensevensi.springsecurity.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends  JpaRepository<User, Integer>{
    public User findByUsername(String username);
}
