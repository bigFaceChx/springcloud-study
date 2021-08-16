package com.chx.zhyq.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description: TODO
 * @Author LH
 * @Date 2021/8/11 11:45
 **/
@Configuration
public class FeignConfig {

    @Bean
    public Logger.Level feignLoggerLevel(){
        return  Logger.Level.FULL;
    }
}
