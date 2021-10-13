package com.ferko.service.impl;

import com.ferko.service.UserService;
import org.apache.dubbo.config.annotation.Service;


//@Service//spring的注解，将该类注入到IOC容器中去
@Service //dubbo的注解，将这个类提供的服务对外发布，将访问地址、ip、端口号、路径注册到注册中心去
public class UserServiceImpl implements UserService {

    public String sayHello() {
        return "hello world";
    }
}
