package com.muuu;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Reference
    IHelloService helloService;

    @RequestMapping("hello")
    public String sayHello(){
        System.out.println(helloService.sayHello("enheng"));
        return helloService.sayHello("enheng");
    }
}
