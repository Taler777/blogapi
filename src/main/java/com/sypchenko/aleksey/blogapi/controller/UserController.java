package com.sypchenko.aleksey.blogapi.controller;

import com.sypchenko.aleksey.blogapi.model.User;
import com.sypchenko.aleksey.blogapi.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<User> getAll() {
        List<User> users = userService.getAllUser();
        return users;
    }

    @GetMapping("/users/{id}")
    public User getOne(@PathVariable("id") User user) {
        return user;
    }
    //TODO - сделать редактирование юзером своего профиля
}
