package com.szss.commons.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

/**
 * Created by zcg on 15/10/6.
 */
public class UserInfoDetails implements UserDetails {

    private Long id;

    private String username;

    private String password;

    private Boolean enabled;

    private List<CustomGrantedAuthority> authorities;

    public UserInfoDetails(Long id, String username, String password, Boolean enabled, List<CustomGrantedAuthority> authorities) {
        this.id=id;
        this.username = username;
        this.password = password;
        this.enabled = enabled;
        this.authorities=authorities;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }


    public String getPassword() {
        return this.password;
    }


    public String getUsername() {
        return this.username;
    }


    public boolean isAccountNonExpired() {
        return true;
    }


    public boolean isAccountNonLocked() {
        return enabled;
    }


    public boolean isCredentialsNonExpired() {
        return true;
    }


    public boolean isEnabled() {
        return enabled;
    }
}
