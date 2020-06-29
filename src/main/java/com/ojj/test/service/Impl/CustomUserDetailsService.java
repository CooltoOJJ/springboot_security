package com.ojj.test.service.Impl;

import com.ojj.test.Dao.IUser;
import com.ojj.test.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    IUser user;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        //从数据库中根据输入的名字查找用户，返回userinfo
        User userinfo = user.findUserByName(username);
        //把权限属性放到 SimpleGrantedAuthority类,由于一个用户可能有多个权限，因此放到List<SimpleGrantedAuthority> authorities
        List<SimpleGrantedAuthority> authorities = new ArrayList<SimpleGrantedAuthority>();
        authorities.add(new SimpleGrantedAuthority("ROLE_"+userinfo.getRoot()));
        //返回org.springframework.security.core.userdetails.User，把数据库查到的用户信息写入，返回作判断
        org.springframework.security.core.userdetails.User user =
                new org.springframework.security.core.userdetails.User(userinfo.getUser(),new BCryptPasswordEncoder().encode(userinfo.getPassword()),true,true,true,true,authorities);

        return user;
    }
}
