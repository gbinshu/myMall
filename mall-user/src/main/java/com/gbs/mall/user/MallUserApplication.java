package com.gbs.mall.user;

//import org.mybatis.spring.annotation.MapperScan;//不使用通用mapper
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;//使用通用mapper

@SpringBootApplication
@MapperScan(basePackages = "com.gbs.mall.user.mapper")
public class MallUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallUserApplication.class, args);
    }

}
