package com.springboot.dubbo.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.concurrent.CountDownLatch;

/**
 * Created by farben on 2017/5/9.
 */
@SpringBootApplication
public class ConsumeApplication {
//    @Bean
//    public CountDownLatch closeLatch() {
//        return new CountDownLatch(1);
//    }
    public static void main(String[] args) {

        SpringApplication.run(ConsumeApplication.class,args);
//        ApplicationContext ctx = new SpringApplicationBuilder()
//                .sources(ConsumeApplication.class)
//                .web(false)
//                .run(args);
//
//        CountDownLatch closeLatch = ctx.getBean(CountDownLatch.class);
//        closeLatch.await();
    }
}
