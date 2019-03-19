package com.fengliao.feign;


import com.fengliao.userEntity.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BaseError implements QueryData {
    @Override
    public List<User> getUserAll() {
        return null;
    }

    @Override
    public User getUserById(String id) {
        return null;
    }

    @Override
    public void saveUser(User user) {

    }
}
