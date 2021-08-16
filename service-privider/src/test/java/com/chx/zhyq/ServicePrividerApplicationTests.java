package com.chx.zhyq;

import com.chx.zhyq.controller.UserController;
import com.chx.zhyq.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ServicePrividerApplicationTests {

    @Autowired
    UserController userController;
    @Test
    void contextLoads() {
        List<User> all = userController.findAll();
        System.out.println(all);
    }

}
