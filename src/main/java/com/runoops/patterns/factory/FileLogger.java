package com.runoops.patterns.factory;

/**
 * 具体产品：文件日志
 */
public class FileLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("【文件日志】" + message);
    }
}
