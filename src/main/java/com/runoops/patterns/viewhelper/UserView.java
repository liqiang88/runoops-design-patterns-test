package com.runoops.patterns.viewhelper;

import java.util.List;

/**
 * View: render only, delegate data work to helper
 */
public class UserView {
    private final UserViewHelper helper;

    public UserView(UserViewHelper helper) {
        this.helper = helper;
    }

    public void render() {
        List<User> userList = helper.getUserList();
        System.out.println("==== Render User List Page ====");
        for (User user : userList) {
            String fmtTime = helper.formatTime(user.getRegisterTime());
            System.out.println("Id:" + user.getId() + ", Name:" + user.getName() + ", " + fmtTime);
        }
    }
}
