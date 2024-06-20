package com.example.user.user.User;

import org.springframework.data.jpa.repository.JpaRepository;

import com.google.common.base.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    UserEntity findByUserId(String userId);

}
