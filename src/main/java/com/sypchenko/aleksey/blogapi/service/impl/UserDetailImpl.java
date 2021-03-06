//package com.sypchenko.aleksey.blogapi.service.impl;
//
//import com.sypchenko.aleksey.blogapi.model.State;
//import com.sypchenko.aleksey.blogapi.model.User;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import java.util.Collection;
//import java.util.Collections;
//
//public class UserDetailImpl implements UserDetails {
//    private User user;
//
//    public UserDetailImpl(User user) {
//        this.user = user;
//    }
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//       String userRole = user.getRole().name();
//        SimpleGrantedAuthority authority = new SimpleGrantedAuthority(userRole);
//        return Collections.singletonList(authority);
//    }
//
//    @Override
//    public String getPassword() {
//        return user.getPassword();
//    }
//
//    @Override
//    public String getUsername() {
//        return user.getLogin();
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
////        return !user.getState().equals(State.BANNED);
//        return true;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isEnabled() {
////        return user.getState().equals(State.ACTIVE);
//        return true;
//    }
//
//    public User getUser() {
//        return user;
//    }
//}