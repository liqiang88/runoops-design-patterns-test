package com.runoops.patterns.factory;

/**
 * 具体工厂：控制台日志工厂
 */
public class ConsoleLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        return new ConsoleLogger();
    }
}
