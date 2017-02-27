package com.hnglng.sample.spring.data.jpa;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Created by Bright Huang on 1/8/17.
 */
@SpringBootApplication
@MapperScan(basePackages = "com.hnglng.sample.spring.data.jpa.domain.model")
public class Application extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
