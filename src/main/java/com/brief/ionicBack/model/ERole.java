package com.brief.ionicBack.model;

import java.util.HashSet;
import java.util.Set;

public enum ERole {
    ROLE_ADMIN;

    public static Set<ERole> ConvertFromString(Set<String> role) {
        Set<ERole> roles = new HashSet<>();
        role.forEach(str -> roles.add(ERole.valueOf(str)));
        return roles;
    }
}
