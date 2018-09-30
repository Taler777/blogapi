package com.sypchenko.aleksey.blogapi.controller;

import com.sypchenko.aleksey.blogapi.model.User;
import com.sypchenko.aleksey.blogapi.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/users")
    public List<User> showUsersList() {
        List<User> users = userService.getAllUser();
        return users;
    }

//    @RequestMapping(value = "/profile/{id}", method = GET)
//    public String showUserProfile(Model model, @PathVariable("id") Long id) {
//        model.addAttribute("user", userService.getUserById(id));
//        return "user";
//    }
}
