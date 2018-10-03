package com.sypchenko.aleksey.blogapi.controller;

import com.sypchenko.aleksey.blogapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class RegistrationController {
    final UserService userService;

    @Autowired
    public RegistrationController(UserService userService) {
        this.userService = userService;
    }

    //TODO - переименовать signUp в Registration
    @GetMapping("/signUp")
    public void getSignUpPage() {
    }

    @PostMapping("/signUp")
    public ResponseEntity<Object> addUser(@RequestParam("login") String login, @RequestParam("password") String password) {
        userService.addUser(login, password, new Date());
        return ResponseEntity.ok().build();
        //return "redirect:/login";
    }
}
