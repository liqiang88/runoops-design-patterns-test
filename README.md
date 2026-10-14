# runoops-design-patterns-test

设计模式示例代码，对应 [runoops.com](https://runoops.com) 相关文章。

## 目录结构

```
src/main/java/com/runoops/patterns/
├── singleton/         # 单例模式（五种实现 + Demo）
├── factory/           # 工厂方法模式（日志示例 + Demo）
├── abstractfactory/   # 抽象工厂模式（电子产品族 + Demo）
├── builder/           # 建造者模式（电脑组装 + Demo）
├── prototype/         # 原型模式（浅拷贝 / 深拷贝 + Demo）
└── adapter/           # 适配器模式（对象 / 类适配器 + Demo）
```

## 环境要求

- JDK 8+
- Maven 3.6+

## 编译

```bash
mvn compile
```

## 运行 Demo

> PowerShell 下 `-D...` 参数需加引号，否则会被拆开解析。

单例模式：

```powershell
mvn -q exec:java "-Dexec.mainClass=com.runoops.patterns.singleton.SingletonDemo"
```

工厂方法模式：

```powershell
mvn -q exec:java "-Dexec.mainClass=com.runoops.patterns.factory.FactoryMethodDemo"
```

抽象工厂模式：

```powershell
mvn -q exec:java "-Dexec.mainClass=com.runoops.patterns.abstractfactory.AbstractFactoryDemo"
```

建造者模式：

```powershell
mvn -q exec:java "-Dexec.mainClass=com.runoops.patterns.builder.BuilderDemo"
```

原型模式：

```powershell
mvn -q exec:java "-Dexec.mainClass=com.runoops.patterns.prototype.PrototypeDemo"
```

适配器模式：

```powershell
mvn -q exec:java "-Dexec.mainClass=com.runoops.patterns.adapter.AdapterDemo"
```

## 相关文章

- [单例模式](https://runoops.com/design-patterns-singleton.html)
- [工厂方法模式](https://runoops.com/design-patterns-factory-method.html)
- [抽象工厂模式](https://runoops.com/ddesign-patterns-abstract-factory.html)
- [建造者模式](https://runoops.com/design-patterns-builder.html)
- [原型模式](https://runoops.com/design-patterns-prototype.html)
- [适配器模式](https://runoops.com/design-patterns-adapter.html)
