package com.spring.service;

import com.spring.model.User;
import java.util.List;

public interface UserService {
    void add(User user);

    User get(Long userId);

    List<User> listUsers();
}
