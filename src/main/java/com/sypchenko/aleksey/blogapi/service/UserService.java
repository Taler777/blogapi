package com.sypchenko.aleksey.blogapi.service;

import com.sypchenko.aleksey.blogapi.model.User;

import java.util.List;

public interface UserService {
    String addUser(String login, String password);

    void deleteUser(Long id);

    User getUserById(Long id);

    User findByLogin(String login);

    User editUser(User user);

    List<User> getAllUser();
}
