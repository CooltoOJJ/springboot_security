package com.ojj.test.controller;

import com.ojj.test.bean.User;
import com.ojj.test.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Mycontroller {

    @Autowired
    private IService service;

//    @RequestMapping(value = "/hello",method = RequestMethod.POST)
//    public String gotoHello(String name){
//
//        User user1 = service.find(name);
//        System.out.println(user1);
//        return "hello";
//    }

}
