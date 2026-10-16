package com.runoops.patterns.dao;

/**
 * DAO Interface: user data access
 */
public interface UserDao {
    User findById(Integer id);

    void save(User user);
}
