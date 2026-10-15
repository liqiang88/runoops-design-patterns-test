package com.runoops.patterns.facade;

/**
 * Facade pattern demo (client)
 * Article: https://runoops.com/design-patterns-facede.html
 *
 * Client only calls watchMovie / endMovie; no need to know device order.
 */
public class FacadeDemo {

    public static void main(String[] args) {
        Light light = new Light();
        Projector projector = new Projector();
        Player player = new Player();

        HomeTheaterFacade theater = new HomeTheaterFacade(light, projector, player);
        theater.watchMovie();
        theater.endMovie();
    }
}
