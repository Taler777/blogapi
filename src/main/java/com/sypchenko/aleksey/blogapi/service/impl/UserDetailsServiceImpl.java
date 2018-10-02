package com.sypchenko.aleksey.blogapi.service.impl;

import com.sypchenko.aleksey.blogapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    final UserRepository userRepository;

    @Autowired
    public UserDetailsServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
//        Optional<User> userCandidate = userRepository.findByLogin(login);
//        if (userCandidate.isPresent()) {
//            return new UserDetailImpl(userCandidate.get());
//        } else throw new IllegalArgumentException("User not found");
        return new UserDetailImpl(userRepository.findByLogin(login)
                .orElseThrow(IllegalArgumentException::new));
    }
}
