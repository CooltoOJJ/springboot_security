package com.ojj.test.service;

import com.ojj.test.Dao.IUser;
import com.ojj.test.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public interface IService {

    public User find(String name);

}
