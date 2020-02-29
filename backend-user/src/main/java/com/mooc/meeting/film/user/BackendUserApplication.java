package com.mooc.meeting.film.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.mooc.meeting.film.user.dao")
public class BackendUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendUserApplication.class, args);
    }

}
