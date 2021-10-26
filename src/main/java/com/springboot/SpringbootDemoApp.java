package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author 吴金才
 * @Description *
 * @date 2021/9/16 9:05 下午
 */
@EnableAutoConfiguration
@ComponentScan
public class SpringbootDemoApp {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootDemoApp.class, args);
    }
}
