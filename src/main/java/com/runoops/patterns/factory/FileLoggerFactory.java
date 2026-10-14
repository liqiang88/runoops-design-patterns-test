package com.runoops.patterns.factory;

/**
 * 具体工厂：文件日志工厂
 */
public class FileLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        return new FileLogger();
    }
}
