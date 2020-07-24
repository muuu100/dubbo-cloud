package com.muuu;

import com.alibaba.dubbo.config.annotation.Service;

@Service
public class HelloServiceImpl implements IHelloService {
    @Override
    public String sayHello(String name) {
        System.out.println("hello," + name);
        return "hello," + name;
    }
}
