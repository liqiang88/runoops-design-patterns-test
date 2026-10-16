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
├── adapter/           # 适配器模式（对象 / 类适配器 + Demo）
├── bridge/            # 桥接模式（消息类型 × 发送渠道 + Demo）
├── composite/         # 组合模式（文件目录树 + Demo）
├── decorator/         # 装饰模式（咖啡配料叠加 + Demo）
├── facade/            # 外观模式（家庭影院门面 + Demo）
├── flyweight/         # 享元模式（棋子对象池 + Demo）
├── proxy/             # 代理模式（图片虚拟代理 + Demo）
├── chain/             # 责任链模式（请假审批链 + Demo）
├── command/           # 命令模式（遥控器开关灯 + Demo）
├── iterator/          # 迭代器模式（自定义集合遍历 + Demo）
├── memento/           # 备忘录模式（编辑器快照回滚 + Demo）
├── state/             # 状态模式（订单状态流转 + Demo）
├── strategy/          # 策略模式（折扣算法切换 + Demo）
├── templatemethod/    # 模板方法模式（饮品制作流程 + Demo）
├── visitor/           # 访问者模式（电脑部件访问 + Demo）
├── mediator/          # 中介者模式（聊天室转发 + Demo）
├── observer/          # 观察者模式（气象站通知 + Demo）
├── interpreter/       # 解释器模式（加减表达式树 + Demo）
├── mvc/               # MVC 架构模式（用户查询分层 + Demo）
├── dao/               # DAO 数据访问对象模式（持久层隔离 + Demo）
├── businessdelegate/  # 业务代表模式（表现层与业务层解耦 + Demo）
├── compositeentity/   # 组合实体模式（粗粒度用户实体 + Demo）
├── frontcontroller/   # 前端控制器模式（统一入口分发 + Demo）
├── interceptingfilter/# 拦截过滤器模式（过滤器链预处理 + Demo）
├── servicelocator/    # 服务定位器模式（服务查找缓存 + Demo）
├── transferobject/    # 传输对象模式（DTO 跨层传数 + Demo）
├── sessionfacade/     # 会话外观模式（订单业务编排 + Demo）
├── viewhelper/        # 视图助手模式（列表数据格式化 + Demo）
└── compositeview/     # 组合视图模式（页面片段拼装 + Demo）
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

桥接模式：

```powershell
mvn -q exec:java "-Dexec.mainClass=com.runoops.patterns.bridge.BridgeDemo"
```

组合模式：

```powershell
mvn -q exec:java "-Dexec.mainClass=com.runoops.patterns.composite.CompositeDemo"
```

装饰模式：

```powershell
mvn -q exec:java "-Dexec.mainClass=com.runoops.patterns.decorator.DecoratorDemo"
```

外观模式：

```powershell
mvn -q exec:java "-Dexec.mainClass=com.runoops.patterns.facade.FacadeDemo"
```

享元模式：

```powershell
mvn -q exec:java "-Dexec.mainClass=com.runoops.patterns.flyweight.FlyweightDemo"
```

代理模式：

```powershell
mvn -q exec:java "-Dexec.mainClass=com.runoops.patterns.proxy.ProxyDemo"
```

责任链模式：

```powershell
mvn -q exec:java "-Dexec.mainClass=com.runoops.patterns.chain.ChainDemo"
```

命令模式：

```powershell
mvn -q exec:java "-Dexec.mainClass=com.runoops.patterns.command.CommandDemo"
```

迭代器模式：

```powershell
mvn -q exec:java "-Dexec.mainClass=com.runoops.patterns.iterator.IteratorDemo"
```

备忘录模式：

```powershell
mvn -q exec:java "-Dexec.mainClass=com.runoops.patterns.memento.MementoDemo"
```

状态模式：

```powershell
mvn -q exec:java "-Dexec.mainClass=com.runoops.patterns.state.StateDemo"
```

策略模式：

```powershell
mvn -q exec:java "-Dexec.mainClass=com.runoops.patterns.strategy.StrategyDemo"
```

模板方法模式：

```powershell
mvn -q exec:java "-Dexec.mainClass=com.runoops.patterns.templatemethod.TemplateMethodDemo"
```

访问者模式：

```powershell
mvn -q exec:java "-Dexec.mainClass=com.runoops.patterns.visitor.VisitorDemo"
```

中介者模式：

```powershell
mvn -q exec:java "-Dexec.mainClass=com.runoops.patterns.mediator.MediatorDemo"
```

观察者模式：

```powershell
mvn -q exec:java "-Dexec.mainClass=com.runoops.patterns.observer.ObserverDemo"
```

解释器模式：

```powershell
mvn -q exec:java "-Dexec.mainClass=com.runoops.patterns.interpreter.InterpreterDemo"
```

MVC 架构模式：

```powershell
mvn -q exec:java "-Dexec.mainClass=com.runoops.patterns.mvc.MvcDemo"
```

DAO 数据访问对象模式：

```powershell
mvn -q exec:java "-Dexec.mainClass=com.runoops.patterns.dao.DaoDemo"
```

业务代表模式：

```powershell
mvn -q exec:java "-Dexec.mainClass=com.runoops.patterns.businessdelegate.BusinessDelegateDemo"
```

组合实体模式：

```powershell
mvn -q exec:java "-Dexec.mainClass=com.runoops.patterns.compositeentity.CompositeEntityDemo"
```

前端控制器模式：

```powershell
mvn -q exec:java "-Dexec.mainClass=com.runoops.patterns.frontcontroller.FrontControllerDemo"
```

拦截过滤器模式：

```powershell
mvn -q exec:java "-Dexec.mainClass=com.runoops.patterns.interceptingfilter.InterceptingFilterDemo"
```

服务定位器模式：

```powershell
mvn -q exec:java "-Dexec.mainClass=com.runoops.patterns.servicelocator.ServiceLocatorDemo"
```

传输对象模式：

```powershell
mvn -q exec:java "-Dexec.mainClass=com.runoops.patterns.transferobject.TransferObjectDemo"
```

会话外观模式：

```powershell
mvn -q exec:java "-Dexec.mainClass=com.runoops.patterns.sessionfacade.SessionFacadeDemo"
```

视图助手模式：

```powershell
mvn -q exec:java "-Dexec.mainClass=com.runoops.patterns.viewhelper.ViewHelperDemo"
```

组合视图模式：

```powershell
mvn -q exec:java "-Dexec.mainClass=com.runoops.patterns.compositeview.CompositeViewDemo"
```

## 相关文章

- [单例模式](https://runoops.com/design-patterns-singleton.html)
- [工厂方法模式](https://runoops.com/design-patterns-factory-method.html)
- [抽象工厂模式](https://runoops.com/ddesign-patterns-abstract-factory.html)
- [建造者模式](https://runoops.com/design-patterns-builder.html)
- [原型模式](https://runoops.com/design-patterns-prototype.html)
- [适配器模式](https://runoops.com/design-patterns-adapter.html)
- [桥接模式](https://runoops.com/design-patterns-bridge.html)
- [组合模式](https://runoops.com/design-patterns-composite.html)
- [装饰模式](https://runoops.com/design-patterns-decorator.html)
- [外观模式](https://runoops.com/design-patterns-facede.html)
- [享元模式](https://runoops.com/design-patterns-flyweight.html)
- [代理模式](https://runoops.com/design-patterns-proxy.html)
- [责任链模式](https://runoops.com/design-patterns-chain.html)
- [命令模式](https://runoops.com/design-patterns-command.html)
- [迭代器模式](https://runoops.com/design-patterns-iterator.html)
- [备忘录模式](https://runoops.com/design-patterns-momento.html)
- [状态模式](https://runoops.com/design-patterns-state.html)
- [策略模式](https://runoops.com/design-patterns-strategy.html)
- [模板方法模式](https://runoops.com/design-patterns-template-method.html)
- [访问者模式](https://runoops.com/design-patterns-visitor.html)
- [中介者模式](https://runoops.com/design-patterns-mediator.html)
- [观察者模式](https://runoops.com/design-patterns-observer.html)
- [解释器模式](https://runoops.com/design-patterns-interpreter.html)
- [MVC模式](https://runoops.com/architectural-pattern-mvc.html)
- [数据访问对象模式](https://runoops.com/design-patterns-dao.html)
- [业务代表模式](https://runoops.com/design-patterns-business-delegate.html)
- [组合实体模式](https://runoops.com/design-patterns-composite-entiy.html)
- [前端控制器模式](https://runoops.com/design-patterns-front-controller.html)
- [拦截过滤器模式](https://runoops.com/design-patterns-intercepting-filter.html)
- [服务定位器模式](https://runoops.com/design-patterns-service-locator.html)
- [传输对象模式](https://runoops.com/design-patterns-transer-object.html)
- [会话外观模式](https://runoops.com/design-patterns-session-facede.html)
- [视图助手模式](https://runoops.com/design-patterns-view-helper.html)
- [组合视图模式](https://runoops.com/design-patterns-composite-view.html)
