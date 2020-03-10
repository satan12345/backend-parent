package com.mooc.meeting.film.hall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication(scanBasePackages = {
        "com.mooc.meeting.film.hall",
        "com.mooc.meeting.film.common",
})
@MapperScan(basePackages = "com.mooc.meeting.film.hall.dao")
@EnableDiscoveryClient
public class BackendHallApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendHallApplication.class, args);
    }

}
