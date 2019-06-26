package com.lina.project.oops.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.lina.project.oops.dao.database")
@ComponentScan(value = {"com.lina.project.oops.dao.service","com.lina.project.oops.web"})
public class Application
{
    public static void main(String[] args)
    {
        SpringApplication.run(Application.class);
    }
}
