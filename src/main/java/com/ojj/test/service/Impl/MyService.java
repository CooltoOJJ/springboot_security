package com.ojj.test.service.Impl;

import com.ojj.test.Dao.IUser;
import com.ojj.test.bean.User;
import com.ojj.test.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService implements IService {

    @Autowired
    IUser user;

    @Override
    public User find(String name) {
        return user.findUserByName(name);
    }
}
