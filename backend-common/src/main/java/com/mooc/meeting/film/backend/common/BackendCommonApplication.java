package com.mooc.meeting.film.backend.common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.mooc.meeting.film.backend.common.dao")
public class BackendCommonApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendCommonApplication.class, args);
    }

}
