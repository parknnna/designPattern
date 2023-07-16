# Design Pattern

### 디자인 패턴이란
>소프트웨어를 설계할 때 특정 맥락에서 자주 발생하는 고질적인 문제들이 또 발생했을 때 재사용할 할 수있는 훌륭한 해결책
“바퀴를 다시 발명하지 마라(Don’t reinvent the wheel)” 이미 만들어져서 잘 되는 것을 처음부터 다시 만들 필요가 없다는 의미이다. <br>
패턴이란 각기 다른 소프트웨어 모듈이나 기능을 가진 다양한 응용 소프트웨어 시스템들을 개발할 때도 서로 간에 공통되는 설계 문제가 존재하며 이를 처리하는 해결책 사이에도 공통점이 있다. <br>이러한 유사점을 패턴이라 한다.<br>
패턴은 공통의 언어를 만들어주며 팀원 사이의 의사 소통을 원활하게 해주는 아주 중요한 역할을 한다.


### GoF(Gang of Fout) 디자인 패턴
> 23 가지의 디자인 패턴을 정리하고 각각의 디자인 패턴을 <br>생성(Creational), 구조(Structural), 행위(Behavioral) 3가지로 분류 했다.

<table>
   <thead>
      <tr>
         <td>생성(Creational)</td>
         <td>구조(Structural)</td>
         <td>행위(Behavioral)</td>
      </tr>
   </thead>
   <tbody>
      <tr>
         <td>
            • <a href="https://github.com/parknnna/designPattern/blob/master/src/creational/abstractFactoryPattern/AbstractFactoryPattern.md">추상팩토리(Abstract Factory)</a> <br/>
            • <a href="https://github.com/parknnna/designPattern/blob/master/src/creational/builderPattern/builderPattern.md">빌더(Builder)</a> <br/>
            • <a href="https://github.com/parknnna/designPattern/blob/master/src/creational/factoryMethodPattern/factoryMethodPattern.md">팩토리 메소드(FactoryMethod)</a> <br/>
            • <a href="https://github.com/parknnna/designPattern/blob/master/src/creational/prototypePattern/prototypePattern.md">프로토 타입(ProtoType)</a> <br/>
            • <a href="https://github.com/parknnna/designPattern/blob/master/src/creational/singletonPattern/singleton.md">싱글톤(Singleton)</a> <br/>
         </td>
         <td>
            • <a href="https://github.com/parknnna/designPattern/blob/master/src/structural/adapterPattern/adapterPattern.md">어댑터(Adapter)</a> <br/>
            • <a href="https://github.com/parknnna/designPattern/blob/master/src/structural/bridgePattern/bridgePattern.md">브리지(Bridge)</a> <br/>
            • <a href="https://github.com/parknnna/designPattern/blob/master/src/structural/compositePattern/compositePattern.md">컴퍼지트(Composite)</a> <br/>
            • <a href="https://github.com/parknnna/designPattern/blob/master/src/structural/decoratorPattern/decoratorPattern.md">데커레이터(Decorator)</a> <br/>
            • <a href="https://github.com/parknnna/designPattern/blob/master/src/structural/facadePattern/facadePattern.md">퍼사드(Facade)</a> <br/>
            • <a href="https://github.com/parknnna/designPattern/blob/master/src/structural/flyweightPattern/flyweightPattern.md">플라이웨이트(Flyweight)</a> <br/>
            • <a href="https://github.com/parknnna/designPattern/blob/master/src/structural/proxyPattern/proxyPattern.md">프록시(Proxy)</a> <br/>
         </td>
         <td>
            • <a href="https://github.com/parknnna/designPattern/blob/master/src/behavioral/corPattern/CorPattern.md"> 책임 연쇄(Chain of Responsibility)    </a> <br/>
            • <a href="https://github.com/parknnna/designPattern/blob/master/src/behavioral/commandPattern/CommandPattern.md"> 커맨드(Command)                      </a> <br/>
            • <a href="https://github.com/parknnna/designPattern/blob/master/src/behavioral/interpreterPattern/InterpreterPattern.md"> 인터프리터(Interpreter)                </a> <br/>
            • <a href="https://github.com/parknnna/designPattern/blob/master/src/behavioral/iteratorPattern/IteratorPattern.md"> 이터레이터(Iterator)                   </a> <br/>
            • <a href="https://github.com/parknnna/designPattern/blob/master/src/behavioral/mediatorPattern/MediatorPattern.md"> 미디에이터(Mediator)                   </a> <br/>
            • <a href="https://github.com/parknnna/designPattern/blob/master/src/behavioral/mementoPattern/MementoPattern.md"> 메멘토(Memento)                      </a> <br/>
            • <a href="https://github.com/parknnna/designPattern/blob/master/src/behavioral/observerPattern/ObserverPattern.md"> 옵저버(Observer)                     </a> <br/>
            • <a href="https://github.com/parknnna/designPattern/blob/master/src/behavioral/statePattern/StatePattern.md"> 스테이트(State)                       </a> <br/>
            • <a href="https://github.com/parknnna/designPattern/blob/master/src/behavioral/strategyPattern/StrategyPattern.md"> 스트래티지(Strategy)                   </a> <br/>
            • <a href="https://github.com/parknnna/designPattern/blob/master/src/behavioral/templateMethodPattern/TemplateMethodPattern.md"> 템플릿 메서드(Template Method)          </a> <br/>
            • <a href="https://github.com/parknnna/designPattern/blob/master/src/behavioral/visitorPattern/VisitorPattern.md"> 비지터(Visitor)                      </a> <br/>
         </td>
      </tr>
   </tbody>
</table>


1. 생성(Creational) 패턴
    * 객체 생성에 관련된 패턴
    * 객체의 생성과 조합을 캡슐화해 특정 객체가 생성되거나 변경되어도 프로그램 구조에 영향을 크게 받지 않도록 유연성을 제공한다.
2. 구조(Structural) 패턴
    * 클래스나 객체를 조합해 더 큰 구조를 만드는 패턴
    * 예를 들어 서로 다른 인터페이스를 지닌 2개의 객체를 묶어 단일 인터페이스를 제공하거나 객체들을 서로 묶어 새로운 기능을 제공하는 패턴이다.
3. 행위(Behavioral) 패턴
    * 객체난 클래스 사이의 알고리즘이나 책임 분배에 관련된 패턴
    * 한 객체가 혼자 수행할 수 없는 작업을 여러 개의 객체로 어떻게 분배하는지, 또 그렇게 하면서도 객체 사이의 결합도를 최소화 하는것에 중점을 둔다.




 

