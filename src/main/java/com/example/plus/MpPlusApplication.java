package com.example.plus;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;


/**
 * MpPlusApplication:
 *
 * @author zhangxiaoxiang
 * @date 2019/7/2
 */

@Slf4j
//扫描dao层(也叫Mapper接口层,一个意思)
@MapperScan("com.example.plus.mapper")
@SpringBootApplication
public class MpPlusApplication {
    public static void main(String[] args) {
        SpringApplication.run(MpPlusApplication.class, args);
        log.info("mybatis-plus 入门,官方文档");
        System.out.println("https://mp.baomidou.com/");
    }

}
