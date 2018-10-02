package com.sypchenko.aleksey.blogapi.controller;

import com.sypchenko.aleksey.blogapi.service.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class SignUpController {
    final SignUpService signUpService;

    @Autowired
    public SignUpController(SignUpService signUpService) {
        this.signUpService = signUpService;
    }

    @GetMapping("/signUp")
    public void getSignUpPage() {
    }

    @PostMapping("/signUp")
    public String signUp(@RequestParam("login") String login, @RequestParam("password") String password) {
        //TODO - проверка на пустоту и длину значений
        signUpService.signUp(login, password, new Date());

        return "redirect:/login";
    }
}
