package com.runoops.patterns.facade;

/**
 * Facade: unify subsystem calls for home theater
 */
public class HomeTheaterFacade {
    private final Light light;
    private final Projector projector;
    private final Player player;

    public HomeTheaterFacade(Light light, Projector projector, Player player) {
        this.light = light;
        this.projector = projector;
        this.player = player;
    }

    public void watchMovie() {
        System.out.println("=== Prepare to watch movie ===");
        light.dim();
        projector.on();
        player.play();
    }

    public void endMovie() {
        System.out.println("=== End movie ===");
        player.stop();
        projector.off();
        light.bright();
    }
}
