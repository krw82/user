package com.example.user.user.User.Impl;

import java.util.Collections;

import org.springframework.context.annotation.Primary;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.user.user.User.UserEntity;
import com.example.user.user.User.UserRepository;
import com.example.user.user.User.UserService;

import lombok.RequiredArgsConstructor;

@Service
@Primary
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    @Override
    public UserEntity login(String userId) {

        return null;
    }

    @Override
    public UserEntity findById(Long id) {
        return userRepository.findById(id).orElseThrow();
    }

    @Override
    public void createUser(UserEntity userEntity) {
        userEntity.setPassword(passwordEncoder.encode(userEntity.getPassword()));
        userRepository.save(userEntity);
    }

    @Override
    public UserEntity getUserByUserId(String userId) {
        return userRepository.findByUserId(userId);
    }

    @Override
    public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {
        UserEntity savedUser = getUserByUserId(userId);
        return new User(savedUser.getUserName(), savedUser.getPassword(),
                true, true, true, true,
                Collections.emptyList());
    }

}
