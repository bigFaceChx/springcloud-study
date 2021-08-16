package com.chx.zhyq.service.Impl;

import com.chx.zhyq.service.UserService;
import org.springframework.stereotype.Component;

/**
 * @Description: TODO
 * @Author LH
 * @Date 2021/8/11 10:49
 **/
@Component
public class UserServieImpl implements UserService {
    @Override
    public String findAll() {
        return "服务异常，请稍后访问";
    }
}
