package com.ojj.test.service.Impl;

import com.ojj.test.Dao.IUser;
import com.ojj.test.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    IUser user;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {

        User userinfo = user.findUserByName(s);
        List<SimpleGrantedAuthority> authorities = new ArrayList<SimpleGrantedAuthority>();

        authorities.add(new SimpleGrantedAuthority(userinfo.getRoot()));



        org.springframework.security.core.userdetails.User user =
                new org.springframework.security.core.userdetails.User(userinfo.getUser(),userinfo.getPassword(),authorities);

        return user;
    }
}
