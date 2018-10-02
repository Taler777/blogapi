package com.sypchenko.aleksey.blogapi.service;

import java.util.Date;

public interface SignUpService {
    void signUp(String login, String password, Date date);
}
