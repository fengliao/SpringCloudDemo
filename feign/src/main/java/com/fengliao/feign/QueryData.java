package com.fengliao.feign;


import com.fengliao.userEntity.User;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;

/**
 * configuration Feign配置类
 * fallback      Feign调用失败回退处理
 * path          调用接口的全局路径 （类上的RequestMapping("/v1/base") 的/v1/base）
 * feign是内部调用不过zuul网关
 */
@FeignClient(value = "base",configuration = BaseFeignConfig.class,fallback = BaseError.class)
public interface QueryData {
    @RequestLine("GET all")
    List<User> getUserAll();
    //restfull风格携带参数使用@Param
    @RequestLine("GET /{id}")
    User getUserById(@Param("id") String id);

    @RequestLine("POST creatUser")
    void saveUser(@RequestBody User user);
}
