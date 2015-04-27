package com.springapp.mvc.service;

import com.springapp.mvc.domain.beans.User;
import com.springapp.mvc.persistence.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by steven on 4/24/15.
 */
@Service("userbeanService")
public class UserBeanServiceImpl implements UserBeanService {

    @Autowired
    private UserMapper userMapper;

    @Override
    @Transactional
    public void insertUser(User user) {
        userMapper.insertUser(user);
    }

    @Override
    public boolean ifDuplicateUserName(String username) {
        User user = userMapper.getUserByName(username);
        return (null != user);
    }

    @Override
    public User getUserByName(String username) {
        return userMapper.getUserByName(username);
    }
}
