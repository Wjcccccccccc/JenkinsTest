package com.wjc.service.impl;

import com.wjc.mapper.UserMapper;
import com.wjc.pojo.User;
import com.wjc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wjc on 2018/3/15.
 */
@Service("userService")
public class UserServiceimpl implements UserService {


    @Autowired
    UserMapper userMapper;

    @Override
    public void insertUser(User user) {
        userMapper.insert(user);
    }

    @Override
    public List<User> findAllUser() {
        return userMapper.selectAllUser();
    }
}
