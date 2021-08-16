package com.chx.zhyq;


import com.chx.zhyq.controller.UserController;
import org.apache.catalina.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ServiceConsumerApplicationTests {

    @Autowired
    UserController userController;
    @Test
    void contextLoads() {
        //System.out.println(23);
//        List<User> all = userController.findAll();
//        System.out.println(all);
    }

}
