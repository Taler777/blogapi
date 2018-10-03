package com.sypchenko.aleksey.blogapi.service;

import com.sypchenko.aleksey.blogapi.model.User;

import java.util.Date;
import java.util.List;

public interface UserService {
    String addUser(String login, String password, Date date);

    void deleteUser(Long id);

    User getUserById(Long id);

    User editUser(User user);

    List<User> getAllUser();
}
