package com.runoops.patterns.mediator;

/**
 * Mediator pattern demo (client)
 * Article: https://runoops.com/design-patterns-mediator.html
 *
 * Users communicate only through ChatRoom, not directly.
 */
public class MediatorDemo {

    public static void main(String[] args) {
        Mediator chatRoom = new ChatRoom();
        User u1 = new ChatUser("Alice");
        User u2 = new ChatUser("Bob");
        User u3 = new ChatUser("Jack");

        chatRoom.register(u1);
        chatRoom.register(u2);
        chatRoom.register(u3);

        u1.send("Hello everyone");
        u2.send("Hi Alice");
    }
}
