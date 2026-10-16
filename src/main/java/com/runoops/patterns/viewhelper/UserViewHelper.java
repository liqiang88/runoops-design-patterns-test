package com.runoops.patterns.viewhelper;

import java.util.Arrays;
import java.util.List;

/**
 * View Helper: prepare and format data for view
 */
public class UserViewHelper {
    // get data
    public List<User> getUserList() {
        return Arrays.asList(
                new User(1, "Alice", "2026-01-01"),
                new User(2, "Bob", "2026-02-01")
        );
    }

    // format time
    public String formatTime(String rawTime) {
        return "Register Date:" + rawTime;
    }
}
