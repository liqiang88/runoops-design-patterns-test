package com.runoops.patterns.memento;

/**
 * Memento pattern demo (client)
 * Article: https://runoops.com/design-patterns-momento.html
 *
 * Save editor snapshots and restore to a previous version.
 */
public class MementoDemo {

    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        Caretaker caretaker = new Caretaker();

        editor.setContent("Version 1");
        caretaker.add(editor.save());

        editor.setContent("Version 2");
        caretaker.add(editor.save());

        editor.setContent("Version 3");
        System.out.println("Current: " + editor.getContent());

        // restore to version 2
        editor.restore(caretaker.get(1));
        System.out.println("Restore to: " + editor.getContent());
    }
}
