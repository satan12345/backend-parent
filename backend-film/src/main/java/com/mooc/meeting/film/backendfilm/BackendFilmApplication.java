package com.mooc.meeting.film.backendfilm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication(scanBasePackages = {
        "com.mooc.meeting.film.backendfilm",
        "com.mooc.meeting.film.common",
})
@MapperScan(basePackages = "com.mooc.meeting.film.backendfilm.dao")
@EnableDiscoveryClient
public class BackendFilmApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendFilmApplication.class, args);
    }

}
