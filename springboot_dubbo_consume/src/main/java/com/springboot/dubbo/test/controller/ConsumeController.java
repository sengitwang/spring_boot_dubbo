package com.springboot.dubbo.test.controller;

import com.springboot.dubbo.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by farben on 2017/5/9.
 */
@Controller
public class ConsumeController {
    @Autowired
    TestService testService;

    @RequestMapping("/hello")
    @ResponseBody
    public String index(){
        String name=testService.hello("world");
        System.out.println(name);
        return name;
    }

}
