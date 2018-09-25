package com.sypchenko.aleksey.blogapi.service;

import com.sypchenko.aleksey.blogapi.model.User;

import java.util.List;

public interface UserService {
    User addUser(User user);

    void deleteUser(Long id);

    User getUserById(Long id);

    User editUser(User user);

    List<User> getAllUser();
}
