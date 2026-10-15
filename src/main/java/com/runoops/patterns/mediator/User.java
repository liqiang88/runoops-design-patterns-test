package com.runoops.patterns.mediator;

/**
 * Colleague: abstract chat user
 */
public abstract class User {
    protected Mediator mediator;
    protected String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void send(String message);

    public abstract void receive(String from, String message);
}
