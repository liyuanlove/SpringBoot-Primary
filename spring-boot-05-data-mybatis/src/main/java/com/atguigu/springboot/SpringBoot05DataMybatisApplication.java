package com.atguigu.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com.atguigu.springboot.mapper")//扫描Mapper接口注入到容器中
@SpringBootApplication
public class SpringBoot05DataMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot05DataMybatisApplication.class, args);
    }

}
