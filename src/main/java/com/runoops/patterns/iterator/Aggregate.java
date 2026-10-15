package com.runoops.patterns.iterator;

/**
 * Aggregate: create iterator
 */
public interface Aggregate<T> {
    Iterator<T> createIterator();
}
