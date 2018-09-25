package com.sypchenko.aleksey.blogapi.controller;

import com.sypchenko.aleksey.blogapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/page")
    public String showHelloPage(Model model) {
        model.addAttribute("page", null);
        return "page";
    }
}
