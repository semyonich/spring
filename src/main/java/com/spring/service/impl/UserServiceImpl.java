package com.spring.service.impl;

import com.spring.dao.UserDao;
import com.spring.model.User;
import com.spring.service.UserService;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void add(User user) {
        userDao.add(user);
    }

    @Override
    public User get(Long userId) {
        return userDao.get(userId);
    }

    @Override
    public List<User> listUsers() {
        return userDao.listUsers();
    }
}
