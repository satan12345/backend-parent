package com.mooc.meeting.film.backendcinema;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;


@SpringBootApplication(scanBasePackages = {
        "com.mooc.meeting.film.backendcinema",
        "com.mooc.meeting.film.common",
})
@MapperScan(basePackages = "com.mooc.meeting.film.backendcinema.dao")
@EnableDiscoveryClient
public class BackendCinemaApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendCinemaApplication.class, args);
    }

}
