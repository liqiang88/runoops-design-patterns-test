package com.runoops.patterns.memento;

/**
 * Memento: store editor content snapshot
 * Ref: https://runoops.com/design-patterns-momento.html
 */
public class Memento {
    private final String content;

    public Memento(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
