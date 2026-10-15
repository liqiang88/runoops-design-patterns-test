package com.runoops.patterns.command;

/**
 * Command pattern demo (client)
 * Article: https://runoops.com/design-patterns-command.html
 *
 * RemoteControl invokes commands; Light executes real work; undo supported.
 */
public class CommandDemo {

    public static void main(String[] args) {
        Light light = new Light();
        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);

        RemoteControl remote = new RemoteControl();
        remote.setCommand(lightOn);
        remote.pressButton();
        remote.pressUndo();

        remote.setCommand(lightOff);
        remote.pressButton();
        remote.pressUndo();
    }
}
