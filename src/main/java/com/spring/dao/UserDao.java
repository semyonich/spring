package com.spring.dao;

import com.spring.model.User;
import java.util.List;

public interface UserDao {
    void add(User user);

    List<User> listUsers();
}
