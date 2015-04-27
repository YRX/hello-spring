package com.springapp.mvc.persistence;

import com.springapp.mvc.domain.beans.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

/**
 * Created by steven on 4/24/15.
 */

public interface UserMapper {
//    @Insert("INSERT INTO users VALUES (NULL, #{username},#{password})")
    void insertUser(User user);

//  @Select("SELECT user_name as username,
// user_pwd as password FROM users WHERE user_name = #{username} LIMIT 1")
    User getUserByName(String username);
}
