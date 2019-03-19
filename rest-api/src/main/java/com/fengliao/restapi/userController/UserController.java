package com.fengliao.restapi.userController;

import com.fengliao.restapi.userEntity.User;
import com.fengliao.restapi.userService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(value = "/all")
    public List<User> getUserAll(){
        return userService.findAllUser();
    }

    @GetMapping(value = "/{id}")
    public User getUserById(@PathVariable String id){
        return userService.findUserById(id);
    }

    @PostMapping(value = "/creatUser")
    public void saveUser(@RequestBody User user){
        System.out.println(user.toString());
        userService.saveUser(user);
    }
}
