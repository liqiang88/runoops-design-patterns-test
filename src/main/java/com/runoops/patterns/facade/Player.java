package com.runoops.patterns.facade;

/**
 * SubSystem: media player
 */
public class Player {
    public void play() {
        System.out.println("Media player start playing");
    }

    public void stop() {
        System.out.println("Media player stop");
    }
}
