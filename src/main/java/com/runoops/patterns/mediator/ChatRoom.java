package com.runoops.patterns.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * ConcreteMediator: relay messages among users
 */
public class ChatRoom implements Mediator {
    private final List<User> userList = new ArrayList<>();

    @Override
    public void register(User user) {
        userList.add(user);
        user.setMediator(this);
    }

    @Override
    public void relay(String from, String message) {
        for (User user : userList) {
            if (!user.getName().equals(from)) {
                user.receive(from, message);
            }
        }
    }
}
