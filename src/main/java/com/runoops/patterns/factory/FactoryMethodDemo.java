package com.runoops.patterns.factory;

/**
 * 工厂方法模式演示（客户端）
 * 文章：https://runoops.com/design-patterns-factory-method.html
 *
 * 客户端只依赖 Logger、LoggerFactory 抽象，new 具体产品被封装在工厂内。
 */
public class FactoryMethodDemo {

    public static void main(String[] args) {
        LoggerFactory factory = new FileLoggerFactory();
        Logger logger = factory.createLogger();
        logger.log("工厂方法模式测试日志");

        LoggerFactory factory2 = new ConsoleLoggerFactory();
        Logger logger2 = factory2.createLogger();
        logger2.log("控制台输出日志");
    }
}
