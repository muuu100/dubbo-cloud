package com.muuu;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;


@SpringBootApplication
@EnableDubboConfiguration
public class DubboCloudConsumerApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(DubboCloudConsumerApplication.class, args);
        System.in.read();
    }
}
