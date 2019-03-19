package com.fengliao.restapi.dao;

import com.fengliao.restapi.userEntity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    List<User> findAllUser();
    User findUserById(String id);
    void creatUser(User user);
}
