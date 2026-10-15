package com.runoops.patterns.mediator;

/**
 * ConcreteColleague: chat user
 */
public class ChatUser extends User {
    public ChatUser(String name) {
        super(name);
    }

    @Override
    public void send(String message) {
        mediator.relay(name, message);
    }

    @Override
    public void receive(String from, String message) {
        System.out.println(name + " receive message from " + from + ": " + message);
    }
}
