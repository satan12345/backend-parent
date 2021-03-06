package com.mooc.meeting.film.hall.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author : jiangzh
 * @program : com.mooc.meetingfilm.consumer.config
 * @description :
 **/
@Configuration
public class RestConfig {

    @Bean
//    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
//
//    /**
//    * @Description: 负载均衡规则
//    * @Param: []
//    * @return: com.netflix.loadbalancer.IRule
//    * @Author: jiangzh
//    */
//    @Bean
//    public IRule iRule(){
//        return new RoundRobinRule();
////        return new MyRule();
//    }
//
//    @Bean
//    public IPing iPing(){
////        return new PingUrl(false,"/abc");
//        return new NIWSDiscoveryPing();
//    }

}
