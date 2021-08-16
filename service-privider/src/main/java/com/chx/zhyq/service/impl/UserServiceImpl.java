package com.chx.zhyq.service.impl;

import com.chx.zhyq.mapper.UserMapper;
import com.chx.zhyq.pojo.User;
import com.chx.zhyq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: TODO
 * @Author LH
 * @Date 2021/8/8 22:42
 **/
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public List<User> findAll() {
      return   userMapper.findAll();
    }
}
