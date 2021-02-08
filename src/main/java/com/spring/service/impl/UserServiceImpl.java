package com.spring.service.impl;

import com.spring.dao.UserDao;
import com.spring.model.User;
import com.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public void add(User user) {
        userDao.add(user);

    }

    @Override
    public List<User> listUsers() {
        return userDao.listUsers();
    }
}
