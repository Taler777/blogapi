//package com.sypchenko.aleksey.blogapi.service.impl;
//
//import com.sypchenko.aleksey.blogapi.model.Role;
//import com.sypchenko.aleksey.blogapi.model.User;
//import com.sypchenko.aleksey.blogapi.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import java.util.HashSet;
//import java.util.Set;
//
//@Service
//public class UserDetailsServiceImpl implements UserDetailsService {
//    final UserRepository userRepository;
//
//    @Autowired
//    public UserDetailsServiceImpl(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
//
//    @Override
//
//    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
//        User user = userRepository.findByLogin(login);
//
//        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
//        Role role = user.getRole();
//        grantedAuthorities.add(new SimpleGrantedAuthority(role.name()));
//
//
//        return new org.springframework.security.core.userdetails.User(user.getName(), user.getPassword(), grantedAuthorities);
////        return new UserDetailImpl(userRepository.findByLogin(login)
////                .orElseThrow(IllegalArgumentException::new));
//    }
//}