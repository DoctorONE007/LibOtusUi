package com.example.libotusui.security;

public enum ApplicationUserPermission {
    AUTHOR_READ("author:read"),
    AUTHOR_WRITE("author:write");

    private final String permission;

    ApplicationUserPermission(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }
}
