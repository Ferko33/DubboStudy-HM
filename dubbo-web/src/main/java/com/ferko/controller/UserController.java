package com.ferko.controller;


import com.ferko.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
public class UserController {


    /*
        1.从zookeeper 注册中心获取userService的访问url
        2.进行远程调用RPC
        3.将结果封装为一个代理对象，给变量赋值
     */
    @Reference//远程注入
    private UserService userService;

    @GetMapping("/sayHello.do")
    public String sayHello() {
        System.out.println("123");
        return userService.sayHello();
    }
}
