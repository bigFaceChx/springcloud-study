package com.chx.zhyq.controller;

import com.chx.zhyq.service.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import javafx.beans.DefaultProperty;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;

/**
 * @Description: TODO
 * @Author LH
 * @Date 2021/8/8 23:09
 **/
@RestController
@RequestMapping("/user")
@DefaultProperties(defaultFallback = "defaultFallback")
public class UserController {
//    @Autowired
//    DiscoveryClient discoveryClient;
//    @Autowired
//    RestTemplate restTemplate;
    @Autowired
    UserService userService;

    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
//    @HystrixCommand(fallbackMethod = "findAllFallback")
//    @HystrixCommand//不配置，走默认的服务降级方法
    public String findAll(){
          String all = userService.findAll();
//        List<ServiceInstance> instances = discoveryClient.getInstances("SERVICE-PRIVIDER-USER");
//        ServiceInstance serviceInstance = instances.get(0);
//        System.out.println(instances.size());
//        String host = serviceInstance.getHost();
//        int port = serviceInstance.getPort();
//        String url = "http://"+host+":"+port+"/user/findAll";
//        String url = "http://SERVICE-PRIVIDER-USER/user/findAll";
//        String forObject = restTemplate.getForObject(url, String.class);
//        System.out.println(forObject);
        return all;
    }

//    public String defaultFallback(){
//        return "全局默认，服务正在维护，请稍后重试";
//    }

}
