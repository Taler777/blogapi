//package com.sypchenko.aleksey.blogapi.controller;
//
//import com.sypchenko.aleksey.blogapi.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.servlet.http.HttpServletRequest;
//
//@RestController
//public class LoginController {
//    final UserService userService;
//
//    private final PasswordEncoder passwordEncoder;
//
//    @Autowired
//    public LoginController(UserService userService, PasswordEncoder passwordEncoder) {
//        this.userService = userService;
//        this.passwordEncoder = passwordEncoder;
//    }
//
//    @GetMapping("/login")
//    public String getLoginPage(Authentication authentication, HttpServletRequest request) {
//        if (authentication != null) {
//            return "redirect:/";
//        }
//        if (request.getParameterMap().containsKey("error")) {
//            // TODO - что вернем в случае ошибки
//        }
//        return "null from LoginController";
//    }
//
//    @PostMapping("/login")
//    public String login(@RequestParam("login") String login, @RequestParam("password") String password) {
////TODO - доделать
////        if(login.equals(userService.findUserByName(login))) {
////
////        }
//        return "redirect:/";
//    }
//
//
//}
