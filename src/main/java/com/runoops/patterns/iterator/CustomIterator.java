package com.runoops.patterns.iterator;

/**
 * ConcreteIterator: traverse CustomCollection
 */
public class CustomIterator<T> implements Iterator<T> {
    private final CustomCollection<T> collection;
    private int cursor;

    public CustomIterator(CustomCollection<T> collection) {
        this.collection = collection;
        this.cursor = 0;
    }

    @Override
    public boolean hasNext() {
        return cursor < collection.getSize();
    }

    @Override
    public T next() {
        return collection.get(cursor++);
    }
}
