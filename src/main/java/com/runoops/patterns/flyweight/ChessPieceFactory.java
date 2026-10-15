package com.runoops.patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * FlyweightFactory: pool and reuse chess pieces by color
 */
public class ChessPieceFactory {
    private final Map<String, ChessPiece> pool = new HashMap<>();

    public ChessPiece getChessPiece(String color) {
        if (!pool.containsKey(color)) {
            pool.put(color, new ConcreteChessPiece(color));
        }
        return pool.get(color);
    }

    public int getPoolSize() {
        return pool.size();
    }
}
