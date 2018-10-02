package com.sypchenko.aleksey.blogapi.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class LoginController {
    @GetMapping("/login")
    public String getLoginPage(Authentication authentication, HttpServletRequest request) {
        if (authentication != null) {
            return "redirect:/";
        }
        if (request.getParameterMap().containsKey("error")) {
            // TODO - что вернем в случае ошибки
        }
        return "null from LoginController";
    }




}
