package com.example.user.user.User;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.user.user.Entitiy.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    UserEntity findByUserId(String userId);

}
