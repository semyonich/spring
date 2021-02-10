package com.spring.dao;

import com.spring.model.User;
import java.util.List;

public interface UserDao {
    void add(User user);

    User get(Long userId);

    List<User> listUsers();
}
