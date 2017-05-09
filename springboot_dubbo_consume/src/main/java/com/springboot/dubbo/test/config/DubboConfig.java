package com.springboot.dubbo.test.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by farben on 2017/5/9.
 */
@Configuration
@PropertySource("classpath:dubbo/dubbo.properties")
@ImportResource({"classpath:dubbo/dubbo-consume.xml"})
public class DubboConfig {

}
