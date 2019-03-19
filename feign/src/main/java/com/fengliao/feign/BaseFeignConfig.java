package com.fengliao.feign;

import feign.Contract;
import feign.Logger;
import org.springframework.context.annotation.Bean;

/**
 * 只适用于局部feign配置
 */
public class BaseFeignConfig {
    /**
     * 使用feign默认契约，非springMvc写法
     * @return
     */
    @Bean
    public Contract feignContract(){
        return new feign.Contract.Default();
    }

    /**
     * 修改日志等级
     */
    @Bean
    public Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }

}
