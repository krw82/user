package com.example.user.user.User;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.user.user.Entitiy.UserEntity;

public interface UserService extends UserDetailsService {
    UserEntity login(String userId);

    UserEntity findById(Long id);

    void createUser(UserEntity userEntity);

    UserEntity getUserByUserId(String userId);

}
