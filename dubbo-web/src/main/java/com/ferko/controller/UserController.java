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

    @Reference
    private UserService userService;

    @GetMapping("/sayHello.do")
    public String sayHello() {
        System.out.println("123");
        return userService.sayHello();
    }
}
