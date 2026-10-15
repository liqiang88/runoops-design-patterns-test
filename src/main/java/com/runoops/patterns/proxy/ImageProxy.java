package com.runoops.patterns.proxy;

/**
 * Proxy: virtual proxy with lazy load
 */
public class ImageProxy implements Image {
    private final String fileName;
    private RealImage realImage;

    public ImageProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        // delay load until first display
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
