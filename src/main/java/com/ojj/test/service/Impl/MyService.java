package com.ojj.test.service.Impl;

import com.github.pagehelper.PageHelper;
import com.ojj.test.Dao.IUser;
import com.ojj.test.bean.User;
import com.ojj.test.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyService implements IService {

    @Autowired
    IUser user;

    @Override
    public User find(String name) {
        PageHelper.startPage(1,10);
        return user.findUserByName(name);
    }

    @Override
    public List<User> findAll() {
        PageHelper.startPage(2,10);
        return user.findAll();
    }
}
