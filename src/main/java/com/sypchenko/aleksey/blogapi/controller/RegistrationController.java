package com.sypchenko.aleksey.blogapi.controller;

import com.sypchenko.aleksey.blogapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("registration")
public class RegistrationController {
    final UserService userService;

    @Autowired
    public RegistrationController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public void getSignUpPage() {
    }

    @PostMapping
    public String addUser(@RequestParam("login") String login, @RequestParam("password") String password) {
        userService.addUser(login, password);
        ResponseEntity<Object> responseEntity = ResponseEntity.ok().build();
        if (responseEntity.getStatusCodeValue() == 200) {
            String registrationResult = "{" + "\"status\":" + responseEntity.getStatusCodeValue() + "," + "\"userId\":" + userService.findByLogin(login).getId() + "}";

            return registrationResult;
        }
        return responseEntity.toString();
    }
}