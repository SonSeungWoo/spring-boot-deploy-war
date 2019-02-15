package me.seungwoo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = { "me.seungwoo.mapper" })
public class SpringBootDeployWarApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDeployWarApplication.class, args);
    }

}

