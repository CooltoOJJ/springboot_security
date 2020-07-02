package com.ojj.test.controller;

import com.ojj.test.bean.User;
import com.ojj.test.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class Mycontroller {

    @Autowired
    private IService service;

    @RequestMapping(value = "/hh",method = RequestMethod.GET)
    public String gotoHello(){

       System.out.println("gotoHello");
        return "haha";
    }

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public String gotoUser(){

        System.out.println("gotoUser");
        return "uu";
    }

    @ResponseBody
    @RequestMapping(value = "/getuser",method = RequestMethod.GET)
    public List<User> getUser(){

        return service.findAll();
    }

}
