package com.runoops.patterns.memento;

/**
 * Originator: text editor with save / restore
 */
public class TextEditor {
    private String content;

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    // create snapshot
    public Memento save() {
        return new Memento(content);
    }

    // restore from snapshot
    public void restore(Memento memento) {
        this.content = memento.getContent();
    }
}
