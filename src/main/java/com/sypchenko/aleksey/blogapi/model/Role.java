package com.sypchenko.aleksey.blogapi.model;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    USER, ANONIM;

    @Override
    public String getAuthority() {
        return name();
    }
}
