package com.runoops.patterns.proxy;

/**
 * Proxy pattern demo (client)
 * Article: https://runoops.com/design-patterns-proxy.html
 *
 * Virtual proxy: real image loads only on first display().
 */
public class ProxyDemo {

    public static void main(String[] args) {
        Image image = new ImageProxy("high_res_photo.jpg");
        System.out.println("Image proxy created, real image not loaded yet");
        image.display();
        image.display();
    }
}
