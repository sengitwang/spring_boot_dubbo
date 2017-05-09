package com.springboot.dubbo.test.service.impl;

import com.springboot.dubbo.test.service.ExampleService;
import org.springframework.stereotype.Service;

/**
 * Created by farben on 2017/5/9.
 */

@Service
public class ExampleServiceImpl implements ExampleService {
    @Override
    public String hello(String name) {
        System.out.println("Hello "+name);
        return "hello " + name;
    }
}
