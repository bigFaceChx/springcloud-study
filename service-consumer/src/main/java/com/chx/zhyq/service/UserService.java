package com.chx.zhyq.service;

import com.chx.zhyq.config.FeignConfig;
import com.chx.zhyq.service.Impl.UserServieImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "SERVICE-PRIVIDER-USER",
        configuration = FeignConfig.class,
        fallback = UserServieImpl.class)
public interface UserService {

    @RequestMapping("/user/findAll")
    public String findAll();
}
