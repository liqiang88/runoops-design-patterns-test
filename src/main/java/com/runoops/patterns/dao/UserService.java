package com.runoops.patterns.dao;

/**
 * Business Object: call DAO, no DB details
 */
public class UserService {
    private final UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public User getUser(Integer id) {
        return userDao.findById(id);
    }
}
