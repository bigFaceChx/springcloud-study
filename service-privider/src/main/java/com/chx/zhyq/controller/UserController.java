package com.chx.zhyq.controller;

import com.chx.zhyq.pojo.User;
import com.chx.zhyq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description: TODO
 * @Author LH
 * @Date 2021/8/8 22:37
 **/
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "findAll",method = RequestMethod.GET)
    public List<User> findAll(){
        System.out.println("被调用");
//        int i=5/0;
       return userService.findAll();
    }
}
