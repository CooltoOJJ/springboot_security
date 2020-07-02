package com.ojj.test.Dao;

import com.ojj.test.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface IUser {

    @Select("select * from person where user=#{user}")
    public User findUserByName(String name);

    @Select("select * from person")
    List<User> findAll();
}
