package com.runoops.patterns.iterator;

/**
 * Iterator pattern demo (client)
 * Article: https://runoops.com/design-patterns-iterator.html
 *
 * Traverse CustomCollection without exposing internal storage.
 */
public class IteratorDemo {

    public static void main(String[] args) {
        CustomCollection<String> collection = new CustomCollection<>(5);
        collection.add("A");
        collection.add("B");
        collection.add("C");

        Iterator<String> iterator = collection.createIterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.println(item);
        }
    }
}
