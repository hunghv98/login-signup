package com.hunghv98.loginsignup.repository;

import com.hunghv98.loginsignup.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);

    @Override
    List<User> findAll();
}
