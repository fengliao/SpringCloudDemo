package com.fengliao.service.impl;

import com.fengliao.service.HelloService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Administrator on 2018/9/15.
 */
@Service
public class HelloServiceImpl implements HelloService{
    @Autowired
    RestTemplate restTemplate;

    /**
     * 程序名替代了具体的url地址，在ribbon中它会根据服务名来选择具体的服务实例，根据服务实例在请求的时候会用具体的url替换掉服务名
     * @param name
     * @return
     */
    @HystrixCommand(fallbackMethod = "helloError")
    public String hello(String name){
        return restTemplate.getForObject("http://HELLO/hi?name="+name,String.class);
    }

    public String helloError(String name){
        return "GG"+name;
    }
}
