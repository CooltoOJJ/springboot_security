package com.ojj.test.service;

import com.ojj.test.Dao.IUser;
import com.ojj.test.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IService {

    public User find(String name);

    List<User> findAll();
}
