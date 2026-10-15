package com.runoops.patterns.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Caretaker: keep mementos without reading/modifying their content
 */
public class Caretaker {
    private final List<Memento> mementoList = new ArrayList<>();

    public void add(Memento memento) {
        mementoList.add(memento);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
}
