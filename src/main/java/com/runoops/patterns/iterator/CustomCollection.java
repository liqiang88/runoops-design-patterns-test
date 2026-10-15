package com.runoops.patterns.iterator;

/**
 * ConcreteAggregate: simple array-backed collection
 */
@SuppressWarnings("unchecked")
public class CustomCollection<T> implements Aggregate<T> {
    private final T[] items;
    private int index = 0;

    public CustomCollection(int capacity) {
        items = (T[]) new Object[capacity];
    }

    public void add(T item) {
        if (index < items.length) {
            items[index++] = item;
        }
    }

    public T get(int idx) {
        return items[idx];
    }

    public int getSize() {
        return index;
    }

    @Override
    public Iterator<T> createIterator() {
        return new CustomIterator<>(this);
    }
}
