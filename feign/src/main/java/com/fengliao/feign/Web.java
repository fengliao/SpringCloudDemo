package com.fengliao.feign;


import com.fengliao.userEntity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Web {
    @Autowired
    QueryData queryData;

    @GetMapping("/{id}/nameIs")
    public String test(@PathVariable String id){
        User user = queryData.getUserById(id);
        System.out.println(user.toString());
        return "ok"+user.getUserName();
    }

    @GetMapping(value="/save")
    public String save(){
        User usr=new User();
        usr.setCreateBy("feignTest");
        usr.setDeptId("No.1");
        usr.setDeptName("开发部");
        usr.setIp("127.0.0.1");
        usr.setPassword("123456");
        usr.setUserSex("男");
        usr.setUserIdcard("12121212122");
        usr.setUserPhone("18120471897");
        usr.setUserRealname("fengliao");
        usr.setUserNo("9527");
        usr.setUserName("闻道百");
        usr.setFlag("0");
        usr.setDeleteFlag("0");
        queryData.saveUser(usr);
        return "ojbk";
    }

    @GetMapping(value = "all")
    public String findAll(){
        return queryData.getUserAll().toString();
    }
}
