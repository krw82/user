package com.example.user.user.User;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    UserEntity login(String userId);

    UserEntity findById(Long id);

    void createUser(UserEntity userEntity);

    UserEntity getUserByUserId(String userId);

}
