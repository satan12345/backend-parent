package com.mooc.meeting.film.backendshowconsumer.controller;

import com.mooc.meeting.film.backendshowconsumer.service.ConsumerServiceAPI;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @param
 * @author jipeng
 * @date 2020-03-02 18:48
 */
@RestController
public class ConsumerController {

   @Resource
    ConsumerServiceAPI consumerService;
   @GetMapping("sayHello")
   public String sayHello(){
       return consumerService.sayHello();
   }


}

