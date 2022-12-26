package com.example.back.service;

import com.example.back.dao.UserDao;
import com.example.back.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public boolean isExist(String userid) {
        User user = getByUserId(userid);
        return null!=user;
    }

    public User getByName(String username) {
        return userDao.findByUsername(username);
    }
    public User getByUserId(String userid){
        return userDao.findByUserId(userid);
    }

    public User get(String username, String password){
        return userDao.getByUsernameAndPassword(username, password);
    }

    public void add(User user) {
        userDao.save(user);
    }
}
