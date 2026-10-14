package com.runoops.patterns.factory;

/**
 * 具体产品：控制台日志
 */
public class ConsoleLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("【控制台日志】" + message);
    }
}
