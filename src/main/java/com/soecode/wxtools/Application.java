package com.soecode.wxtools;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

//Reference https://blog.csdn.net/antgan/article/details/80288061
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan({"com.soecode.wxtools.*"})
public class Application extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(new Class[]{Application.class});
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
