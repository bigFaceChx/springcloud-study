package com.chx.zhyq.mapper;

import com.chx.zhyq.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Description: TODO
 * @Author LH
 * @Date 2021/8/8 22:43
 **/
@Component
@Mapper
public interface UserMapper {
    List<User> findAll();
}
