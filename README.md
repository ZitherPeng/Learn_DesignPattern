# Learn_DesignPattern
:dart:Record of learning design patterns.



## 设计原则

- 封装变化
- 多用组合，少用继承
- 针对接口编程，不针对实现编程



### 策略模式	

package: ink.zither.strategy

**策略模式**定义了算法簇，分别封装起来,让它们之间可以互相替换，此模式让算法的变化独立于使用算法的客户。



### 观察者模式

package: ink.zither.observer.weather  ink.zither.observer.weatherobservable

**观察者模式**定义了对象之间的一对多依赖，这样一来，当一个对象改变状态时，它的所有依赖者都会收到通知并自动更新。

内置观察者模式：

java.util.Observable

java.util.Observer

