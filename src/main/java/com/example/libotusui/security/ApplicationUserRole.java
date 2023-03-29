package com.example.libotusui.security;

import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static com.example.libotusui.security.ApplicationUserPermission.AUTHOR_READ;
import static com.example.libotusui.security.ApplicationUserPermission.AUTHOR_WRITE;

public enum ApplicationUserRole {
    STUDENT(new HashSet<>(List.of(AUTHOR_READ))),
    ADMIN(new HashSet<>(Arrays.asList(AUTHOR_READ, AUTHOR_WRITE)));

    private final Set<ApplicationUserPermission> permissions;

    ApplicationUserRole(Set<ApplicationUserPermission> permissions) {
        this.permissions = permissions;
    }

    public Set<ApplicationUserPermission> getPermissions() {
        return permissions;
    }

    public Set<SimpleGrantedAuthority> getGrantedAuthorities() {
        Set<SimpleGrantedAuthority> permissions = getPermissions().stream()
                .map(permission -> new SimpleGrantedAuthority(permission.getPermission()))
                .collect(Collectors.toSet());
        permissions.add(new SimpleGrantedAuthority("ROLE_" + this.name()));
        return permissions;
    }

}
