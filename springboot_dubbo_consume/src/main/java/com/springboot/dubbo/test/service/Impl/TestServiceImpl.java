package com.springboot.dubbo.test.service.Impl;

import com.springboot.dubbo.test.service.ExampleService;
import com.springboot.dubbo.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by farben on 2017/5/9.
 */
@Service
public class TestServiceImpl implements TestService {
    @Autowired
    ExampleService exampleService;

    @Override
    public String hello(String name) {
        return exampleService.hello(name);
    }
}
