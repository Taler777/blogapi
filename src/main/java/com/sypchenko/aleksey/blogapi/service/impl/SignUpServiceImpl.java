package com.sypchenko.aleksey.blogapi.service.impl;

import com.sypchenko.aleksey.blogapi.model.User;
import com.sypchenko.aleksey.blogapi.model.UserForm;
import com.sypchenko.aleksey.blogapi.repository.UserRepository;
import com.sypchenko.aleksey.blogapi.service.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class SignUpServiceImpl implements SignUpService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public SignUpServiceImpl(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void signUp(UserForm userForm) {
        String password = passwordEncoder.encode(userForm.getPassword());
        User user = User.builder()
                .login(userForm.getLogin())
                .password(password)
                .build();
        userRepository.saveAndFlush(user);
    }
}
