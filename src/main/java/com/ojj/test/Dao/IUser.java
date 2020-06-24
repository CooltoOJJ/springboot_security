package com.ojj.test.Dao;

import com.ojj.test.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface IUser {

    @Select("select * from person where user=#{user}")
    public User findUserByName(String name);

}
