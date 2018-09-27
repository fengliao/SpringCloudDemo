package com.fengliao.controller;

import com.fengliao.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/9/15.
 */
@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;

    @GetMapping(value = "hi")
    public String hello(@RequestParam String name){
        return helloService.hello(name);
    }
}
