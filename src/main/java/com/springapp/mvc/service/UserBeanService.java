package com.springapp.mvc.service;

import com.springapp.mvc.domain.beans.User;

/**
 * Created by steven on 4/24/15.
 */
public interface UserBeanService {
    void insertUser(User user);
    boolean ifDuplicateUserName(String username);
    User getUserByName(String username);
}
