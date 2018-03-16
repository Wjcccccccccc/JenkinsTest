package com.wjc.service;

import com.wjc.pojo.User;

import java.util.List;

/**
 * Created by wjc on 2018/3/15.
 */
public interface UserService {

    public void insertUser(User user);

    public List<User> findAllUser();
}
