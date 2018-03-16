package com.wjc.controller;

import com.wjc.pojo.User;
import com.wjc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wjc on 2018/3/15.
 */

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;


    @ResponseBody
    @RequestMapping(value = "/add", produces = {"application/json;charset=UTF-8"})
    public void addUser(User user){
        userService.insertUser(user);
    }

    @ResponseBody
    @RequestMapping(value = "/all", produces = {"application/json;charset=UTF-8"})
    public Object findAllUser(){
        return userService.findAllUser();
    }

}
