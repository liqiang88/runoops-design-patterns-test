package com.runoops.patterns.dao;

/**
 * DAO Impl: simulate JDBC / DB operations
 */
public class UserDaoImpl implements UserDao {
    @Override
    public User findById(Integer id) {
        // simulate DB query
        return new User(id, "User_" + id);
    }

    @Override
    public void save(User user) {
        System.out.println("Save user to DB: " + user.getName());
    }
}
