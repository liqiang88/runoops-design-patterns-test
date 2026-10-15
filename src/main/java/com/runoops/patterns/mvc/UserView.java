package com.runoops.patterns.mvc;

/**
 * View: render user data only (simulate JSP)
 */
public class UserView {
    public void render(User user) {
        System.out.println("==== User View Render ====");
        System.out.println("UserId: " + user.getId());
        System.out.println("UserName: " + user.getName());
    }
}
