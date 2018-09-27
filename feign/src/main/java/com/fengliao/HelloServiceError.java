package com.fengliao;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/9/15.
 */
@Component
public class HelloServiceError implements Hello{

    @Override
    public String sayHiFromClientOne(String name) {
        return "error,服务挂掉了！"+name;
    }
}
