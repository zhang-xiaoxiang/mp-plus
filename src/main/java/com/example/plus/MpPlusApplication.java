package com.example.plus;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;


/**
 * MpPlusApplication:
 * @author zhangxiaoxiang
 * @date 2019/7/2
 */
@Slf4j
@MapperScan("com.example.plus.mapper")
@SpringBootApplication
public class MpPlusApplication {

    public static void main(String[] args) {
        SpringApplication.run(MpPlusApplication.class, args);
        log.info("mybatis-plus 入门");
    }

}
