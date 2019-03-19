package com.fengliao.restapi.userService.impl;

import com.fengliao.restapi.dao.UserDao;
import com.fengliao.restapi.userEntity.User;
import com.fengliao.restapi.userService.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public List<User> findAllUser() {
        return userDao.findAllUser();
    }

    @Override
    public User findUserById(String id) {
        return userDao.findUserById(id);
    }

    @Override
    public void saveUser(User user) {
        userDao.creatUser(user);
    }
}
