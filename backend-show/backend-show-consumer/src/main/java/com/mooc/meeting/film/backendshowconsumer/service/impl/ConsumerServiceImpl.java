package com.mooc.meeting.film.backendshowconsumer.service.impl;

import com.mooc.meeting.film.backendshowconsumer.service.ConsumerServiceAPI;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @param
 * @author jipeng
 * @date 2020-03-02 18:52
 */
@Service("consumerService")
@Slf4j
public class ConsumerServiceImpl implements ConsumerServiceAPI {

    @Resource
    RestTemplate restTemplate;

    @Resource
    LoadBalancerClient loadBalancerClient;

    @Override
    public String sayHello() {
        String result = restTemplate.getForObject("http://localhost:7101/sayHello", String.class);
        log.info("调用的结果为:{}",result);
        ServiceInstance serviceInstance = loadBalancerClient.choose("backend-show-provider");
        String host= serviceInstance.getHost();
        int port = serviceInstance.getPort();
        String result1=restTemplate.getForObject("http://"+host+":"+port+"/sayHello",String.class);
        log.info("调用的结果为1:{}",result1);
        return result1;
    }
}

