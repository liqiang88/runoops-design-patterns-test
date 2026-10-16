# runoops-design-patterns-test

Design pattern sample code, corresponding to articles on [runoops.com](https://runoops.com).

## Project Structure

```
src/main/java/com/runoops/patterns/
├── singleton/         # Singleton (five implementations + Demo)
├── factory/           # Factory Method (logger example + Demo)
├── abstractfactory/   # Abstract Factory (electronics product family + Demo)
├── builder/           # Builder (computer assembly + Demo)
├── prototype/         # Prototype (shallow / deep copy + Demo)
├── adapter/           # Adapter (object / class adapter + Demo)
├── bridge/            # Bridge (message type × send channel + Demo)
├── composite/         # Composite (file directory tree + Demo)
├── decorator/         # Decorator (coffee toppings + Demo)
├── facade/            # Facade (home theater facade + Demo)
├── flyweight/         # Flyweight (chess piece object pool + Demo)
├── proxy/             # Proxy (image virtual proxy + Demo)
├── chain/             # Chain of Responsibility (leave approval chain + Demo)
├── command/           # Command (remote control light switch + Demo)
├── iterator/          # Iterator (custom collection traversal + Demo)
├── memento/           # Memento (editor snapshot rollback + Demo)
├── state/             # State (order status transitions + Demo)
├── strategy/          # Strategy (discount algorithm switching + Demo)
├── templatemethod/    # Template Method (beverage preparation flow + Demo)
├── visitor/           # Visitor (computer part visitor + Demo)
├── mediator/          # Mediator (chat room forwarding + Demo)
├── observer/          # Observer (weather station notifications + Demo)
├── interpreter/       # Interpreter (add/subtract expression tree + Demo)
├── mvc/               # MVC architectural pattern (user query layers + Demo)
├── dao/               # DAO (persistence isolation + Demo)
├── businessdelegate/  # Business Delegate (presentation / business decoupling + Demo)
├── compositeentity/   # Composite Entity (coarse-grained user entity + Demo)
├── frontcontroller/   # Front Controller (unified entry + dispatch + Demo)
├── interceptingfilter/# Intercepting Filter (filter chain preprocessing + Demo)
├── servicelocator/    # Service Locator (service lookup cache + Demo)
├── transferobject/    # Transfer Object (DTO cross-layer transfer + Demo)
├── sessionfacade/     # Session Facade (order business orchestration + Demo)
├── viewhelper/        # View Helper (list data formatting + Demo)
└── compositeview/     # Composite View (page fragment assembly + Demo)
```

## Requirements

- JDK 8+
- Maven 3.6+

## Build

```bash
mvn compile
```

## Run Demos

> In PowerShell, wrap `-D...` arguments in quotes; otherwise they may be parsed incorrectly.

Singleton:

```powershell
mvn -q exec:java "-Dexec.mainClass=com.runoops.patterns.singleton.SingletonDemo"
```

Factory Method:

```powershell
mvn -q exec:java "-Dexec.mainClass=com.runoops.patterns.factory.FactoryMethodDemo"
```

Abstract Factory:

```powershell
mvn -q exec:java "-Dexec.mainClass=com.runoops.patterns.abstractfactory.AbstractFactoryDemo"
```

Builder:

```powershell
mvn -q exec:java "-Dexec.mainClass=com.runoops.patterns.builder.BuilderDemo"
```

Prototype:

```powershell
mvn -q exec:java "-Dexec.mainClass=com.runoops.patterns.prototype.PrototypeDemo"
```

Adapter:

```powershell
mvn -q exec:java "-Dexec.mainClass=com.runoops.patterns.adapter.AdapterDemo"
```

Bridge:

```powershell
mvn -q exec:java "-Dexec.mainClass=com.runoops.patterns.bridge.BridgeDemo"
```

Composite:

```powershell
mvn -q exec:java "-Dexec.mainClass=com.runoops.patterns.composite.CompositeDemo"
```

Decorator:

```powershell
mvn -q exec:java "-Dexec.mainClass=com.runoops.patterns.decorator.DecoratorDemo"
```

Facade:

```powershell
mvn -q exec:java "-Dexec.mainClass=com.runoops.patterns.facade.FacadeDemo"
```

Flyweight:

```powershell
mvn -q exec:java "-Dexec.mainClass=com.runoops.patterns.flyweight.FlyweightDemo"
```

Proxy:

```powershell
mvn -q exec:java "-Dexec.mainClass=com.runoops.patterns.proxy.ProxyDemo"
```

Chain of Responsibility:

```powershell
mvn -q exec:java "-Dexec.mainClass=com.runoops.patterns.chain.ChainDemo"
```

Command:

```powershell
mvn -q exec:java "-Dexec.mainClass=com.runoops.patterns.command.CommandDemo"
```

Iterator:

```powershell
mvn -q exec:java "-Dexec.mainClass=com.runoops.patterns.iterator.IteratorDemo"
```

Memento:

```powershell
mvn -q exec:java "-Dexec.mainClass=com.runoops.patterns.memento.MementoDemo"
```

State:

```powershell
mvn -q exec:java "-Dexec.mainClass=com.runoops.patterns.state.StateDemo"
```

Strategy:

```powershell
mvn -q exec:java "-Dexec.mainClass=com.runoops.patterns.strategy.StrategyDemo"
```

Template Method:

```powershell
mvn -q exec:java "-Dexec.mainClass=com.runoops.patterns.templatemethod.TemplateMethodDemo"
```

Visitor:

```powershell
mvn -q exec:java "-Dexec.mainClass=com.runoops.patterns.visitor.VisitorDemo"
```

Mediator:

```powershell
mvn -q exec:java "-Dexec.mainClass=com.runoops.patterns.mediator.MediatorDemo"
```

Observer:

```powershell
mvn -q exec:java "-Dexec.mainClass=com.runoops.patterns.observer.ObserverDemo"
```

Interpreter:

```powershell
mvn -q exec:java "-Dexec.mainClass=com.runoops.patterns.interpreter.InterpreterDemo"
```

MVC:

```powershell
mvn -q exec:java "-Dexec.mainClass=com.runoops.patterns.mvc.MvcDemo"
```

DAO:

```powershell
mvn -q exec:java "-Dexec.mainClass=com.runoops.patterns.dao.DaoDemo"
```

Business Delegate:

```powershell
mvn -q exec:java "-Dexec.mainClass=com.runoops.patterns.businessdelegate.BusinessDelegateDemo"
```

Composite Entity:

```powershell
mvn -q exec:java "-Dexec.mainClass=com.runoops.patterns.compositeentity.CompositeEntityDemo"
```

Front Controller:

```powershell
mvn -q exec:java "-Dexec.mainClass=com.runoops.patterns.frontcontroller.FrontControllerDemo"
```

Intercepting Filter:

```powershell
mvn -q exec:java "-Dexec.mainClass=com.runoops.patterns.interceptingfilter.InterceptingFilterDemo"
```

Service Locator:

```powershell
mvn -q exec:java "-Dexec.mainClass=com.runoops.patterns.servicelocator.ServiceLocatorDemo"
```

Transfer Object:

```powershell
mvn -q exec:java "-Dexec.mainClass=com.runoops.patterns.transferobject.TransferObjectDemo"
```

Session Facade:

```powershell
mvn -q exec:java "-Dexec.mainClass=com.runoops.patterns.sessionfacade.SessionFacadeDemo"
```

View Helper:

```powershell
mvn -q exec:java "-Dexec.mainClass=com.runoops.patterns.viewhelper.ViewHelperDemo"
```

Composite View:

```powershell
mvn -q exec:java "-Dexec.mainClass=com.runoops.patterns.compositeview.CompositeViewDemo"
```

## Related Articles

- [Singleton](https://runoops.com/design-patterns-singleton.html)
- [Factory Method](https://runoops.com/design-patterns-factory-method.html)
- [Abstract Factory](https://runoops.com/ddesign-patterns-abstract-factory.html)
- [Builder](https://runoops.com/design-patterns-builder.html)
- [Prototype](https://runoops.com/design-patterns-prototype.html)
- [Adapter](https://runoops.com/design-patterns-adapter.html)
- [Bridge](https://runoops.com/design-patterns-bridge.html)
- [Composite](https://runoops.com/design-patterns-composite.html)
- [Decorator](https://runoops.com/design-patterns-decorator.html)
- [Facade](https://runoops.com/design-patterns-facede.html)
- [Flyweight](https://runoops.com/design-patterns-flyweight.html)
- [Proxy](https://runoops.com/design-patterns-proxy.html)
- [Chain of Responsibility](https://runoops.com/design-patterns-chain.html)
- [Command](https://runoops.com/design-patterns-command.html)
- [Iterator](https://runoops.com/design-patterns-iterator.html)
- [Memento](https://runoops.com/design-patterns-momento.html)
- [State](https://runoops.com/design-patterns-state.html)
- [Strategy](https://runoops.com/design-patterns-strategy.html)
- [Template Method](https://runoops.com/design-patterns-template-method.html)
- [Visitor](https://runoops.com/design-patterns-visitor.html)
- [Mediator](https://runoops.com/design-patterns-mediator.html)
- [Observer](https://runoops.com/design-patterns-observer.html)
- [Interpreter](https://runoops.com/design-patterns-interpreter.html)
- [MVC](https://runoops.com/architectural-pattern-mvc.html)
- [DAO](https://runoops.com/design-patterns-dao.html)
- [Business Delegate](https://runoops.com/design-patterns-business-delegate.html)
- [Composite Entity](https://runoops.com/design-patterns-composite-entiy.html)
- [Front Controller](https://runoops.com/design-patterns-front-controller.html)
- [Intercepting Filter](https://runoops.com/design-patterns-intercepting-filter.html)
- [Service Locator](https://runoops.com/design-patterns-service-locator.html)
- [Transfer Object](https://runoops.com/design-patterns-transer-object.html)
- [Session Facade](https://runoops.com/design-patterns-session-facede.html)
- [View Helper](https://runoops.com/design-patterns-view-helper.html)
- [Composite View](https://runoops.com/design-patterns-composite-view.html)
