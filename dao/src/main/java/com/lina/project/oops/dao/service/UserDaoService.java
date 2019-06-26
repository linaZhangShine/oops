package com.lina.project.oops.dao.service;

import com.lina.project.oops.dao.database.UserDao;
import com.lina.project.oops.dao.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserDaoService
{
    @Autowired
    private UserDao userDao;

    public UserDao getUserDao()
    {
        return userDao;
    }

    public void setUserDao(UserDao userDao)
    {
        this.userDao = userDao;
    }

    public void insertUser(User user)
    {
        userDao.insertUser(user);
    }
}
