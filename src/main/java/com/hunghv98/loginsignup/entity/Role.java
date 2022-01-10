package com.hunghv98.loginsignup.entity;


import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {

    ADMIN("ROLE_ADMIN"),
    ROLE_USER("ROLE_USER");

    private final String authority;

    Role(String authority) {
        this.authority = authority;
    }

    @Override
    public String getAuthority() {
        return name();
    }
}
