package com.runoops.patterns.mvc;

/**
 * Model: user service (simulate DB query)
 */
public class UserModel {
    public User findUserById(Integer id) {
        // simulate DB query
        return new User(id, "User_" + id);
    }
}
