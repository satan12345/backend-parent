package com.mooc.meeting.film.backendshowprovider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @param
 * @author jipeng
 * @date 2020-03-02 18:32
 */
@RestController
public class ProviderController {
    @Value("${server.port}")
    private int port;
    @GetMapping("sayHello")
    public String sayHello(){
        return "hello--:"+port;
    }
}

