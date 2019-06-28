package com.example.mpplus;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
@EnableAutoConfiguration
public class MpPlusApplication {

    public static void main(String[] args) {
        SpringApplication.run(MpPlusApplication.class, args);
        log.info("mybatis-plus 入门");
    }

}
