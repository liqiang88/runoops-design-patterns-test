package com.runoops.patterns.iterator;

/**
 * Iterator: abstract iterator
 * Ref: https://runoops.com/design-patterns-iterator.html
 */
public interface Iterator<T> {
    boolean hasNext();

    T next();
}
