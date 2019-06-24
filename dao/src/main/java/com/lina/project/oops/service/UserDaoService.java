package com.lina.project.oops.service;

import com.lina.project.oops.dao.UserDao;
import com.lina.project.oops.entity.User;

public class UserDaoService
{
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
