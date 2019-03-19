package com.fengliao.restapi.userService;

import com.fengliao.restapi.userEntity.User;

import java.util.List;

public interface UserService {
    List<User> findAllUser();
    User findUserById(String id);
    void saveUser(User user);
}
