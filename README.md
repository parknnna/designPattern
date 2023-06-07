# Design Pattern

### 디자인 패턴이란
>소프트웨어를 설계할 때 특정 맥락에서 자주 발생하는 고질적인 문제들이 또 발생했을 때 재사용할 할 수있는 훌륭한 해결책
“바퀴를 다시 발명하지 마라(Don’t reinvent the wheel)” 이미 만들어져서 잘 되는 것을 처음부터 다시 만들 필요가 없다는 의미이다. <br>
패턴이란 각기 다른 소프트웨어 모듈이나 기능을 가진 다양한 응용 소프트웨어 시스템들을 개발할 때도 서로 간에 공통되는 설계 문제가 존재하며 이를 처리하는 해결책 사이에도 공통점이 있다. <br>이러한 유사점을 패턴이라 한다.<br>
패턴은 공통의 언어를 만들어주며 팀원 사이의 의사 소통을 원활하게 해주는 아주 중요한 역할을 한다.


### GoF(Gang of Fout) 디자인 패턴
> 23 가지의 디자인 패턴을 정리하고 각각의 디자인 패턴을 <br>생성(Creational), 구조(Structural), 행위(Behavioral) 3가지로 분류 했다.

|                                                              생성(Creational)                                                              |                                                                          구조(Structural)                                                                           |                                                                                                                                             행위(Behavioral)                                                                                                                                             |
|:----------------------------------------------------------------------------------------------------------------------------------------:|:-----------------------------------------------------------------------------------------------------------------------------------------------------------------:|:------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------:|
| • [추상팩토리(Abstract Factory)](https://github.com/parknnna/designPattern/blob/master/src/creational/abstractFactoryPattern/builderPattern.md) <br/>• [빌더(Builder)](https://github.com/parknnna/designPattern/blob/master/src/creational/builderPattern/builderPattern.md) <br/>• [팩토리 메서드(Factory Method)]()<br/>• [프로토타입(Prototype)](https://github.com/parknnna/designPattern/tree/master/src/creational/prototypePattern/prototypePattern.md)<br/>• [싱글톤(Singleton)](https://github.com/parknnna/designPattern/blob/master/src/creational/singletonPattern/singleton.md) | • [어댑터(Adapter)]()<br/>• [브리지(Bridge)]()<br/>• [컴퍼지트(Composite)]()<br/>• [데커레이터(Decorator)]()<br/>• [퍼사드(Facade)]()<br/>• [플라이웨이트(Flyweight)]()<br/>• [프록시(Proxy)]() | • [책임 연쇄(Chain of Responsibility)]()<br/>•  [커맨드(Command)]()<br/>• [인터프리터(Interpreter)]()<br/>• [이터레이터(Iterator)]()<br/>• [미디에이터(Mediator)]()<br/>• [메멘토(Memento)]()<br/>• [옵저버(Observer)]()<br/>• [스테이트(State)]()<br/>• [스트래티지(Strategy)]()<br/>• [템플릿 메서드(Template Method)]()<br/>• [비지터(Visitor)]() |

1. 생성(Creational) 패턴
    * 객체 생성에 관련된 패턴
    * 객체의 생성과 조합을 캡슐화해 특정 객체가 생성되거나 변경되어도 프로그램 구조에 영향을 크게 받지 않도록 유연성을 제공한다.
2. 구조(Structural) 패턴
    * 클래스나 객체를 조합해 더 큰 구조를 만드는 패턴
    * 예를 들어 서로 다른 인터페이스를 지닌 2개의 객체를 묶어 단일 인터페이스를 제공하거나 객체들을 서로 묶어 새로운 기능을 제공하는 패턴이다.
3. 행위(Behavioral) 패턴
    * 객체난 클래스 사이의 알고리즘이나 책임 분배에 관련된 패턴
    * 한 객체가 혼자 수행할 수 없는 작업을 여러 개의 객체로 어떻게 분배하는지, 또 그렇게 하면서도 객체 사이의 결합도를 최소화 하는것에 중점을 둔다.




 

