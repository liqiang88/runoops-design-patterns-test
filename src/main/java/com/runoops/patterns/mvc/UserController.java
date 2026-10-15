package com.runoops.patterns.mvc;

/**
 * Controller: handle request and call model
 */
public class UserController {
    private final UserModel userModel;

    public UserController(UserModel userModel) {
        this.userModel = userModel;
    }

    public User getUserInfo(Integer userId) {
        return userModel.findUserById(userId);
    }
}
