package com.sypchenko.aleksey.blogapi.controller;

import com.sypchenko.aleksey.blogapi.model.UserForm;
import com.sypchenko.aleksey.blogapi.service.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SignUpController {
    final
    SignUpService signUpService;

    @Autowired
    public SignUpController(SignUpService signUpService) {
        this.signUpService = signUpService;
    }

//    @GetMapping("/signUp")
//    public String getSignUpPage() {
//        return "signUp Page";
//    }

    @PostMapping("/signUp")
    public String signUp(UserForm userForm) {
        signUpService.signUp(userForm);
        return "redirect:/login";
    }
}
