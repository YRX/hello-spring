package com.springapp.mvc.persistence;

import com.springapp.mvc.domain.beans.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by steven on 4/28/15.
 */
public class UserMapperImpl implements UserMapper {
    private static final String INSERT_USER = "com.springapp.mvc.persistence.UserMapper.insertUser";
    private static final String GET_USER_BY_NAME = "ccom.springapp.mvc.persistence.UserMapper.getUserByName";

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    @Override
    public void insertUser(User user) {
        if (null != user){
            this.sqlSessionTemplate.insert(INSERT_USER, user);
        }
    }

    @Override
    public User getUserByName(String username) {
        if (username.isEmpty())
            return null;
        return (User)this.sqlSessionTemplate.selectOne(GET_USER_BY_NAME, username);

    }
}
