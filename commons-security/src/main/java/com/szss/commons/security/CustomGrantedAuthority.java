package com.szss.commons.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.util.Assert;

/**
 * Created by zcg on 15/11/30.
 */
public class CustomGrantedAuthority implements GrantedAuthority {

    private String authority;

    public CustomGrantedAuthority() {
    }

    public CustomGrantedAuthority(String authority) {
        Assert.hasText(authority, "A granted authority textual representation is required");
        this.authority = authority;
    }

    public String getAuthority() {
        return authority;
    }
}
