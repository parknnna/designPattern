## Java Design Pattern

## 장식자 패턴(Decorator Pattern)

```
장식자 패턴은 객체의 동적 기능을 추가하기 위해 구조를 개선하는 패턴이다.
다양한 확장을 위해 객체를 조합한다.
```

### 장식자 패팬이란?
* 장식자 패턴은 동적으로 객체를 결합하기 위해 객체지향의 구성을 통해 확장한다. (코드를 변경하지 않고 확장 가능)
* 실시간 동작으로 자신의 객체를 확장하면서, 필요로 하는 다양한 책임을 수행하고 문제를 해결해 나간다.
* 장식자의 기본 배경이 되는 개념은 복합 객체와 위임이다. 상속을 배제하고 구성을 통해 객체를 동적으로 확장한다.

### 장식자 패턴은 언제 사용하면 좋을까?
만약 뼈대는 동일하지만 특정 기능들을 확장하거나 삭제하거나 일부만 변경하는 등 객체를 다양하게 확장하려면 어떻게 해야 할까?  
이럴 경우 새로운 기능을 추가할 때 객체를 동적으로 결합해서 구성을 통해 객체를 확장할 수 있다.  
장식자 패턴은 기존의 객체를 감싸서 새로운 기능을 추가하는 객체를 생성할 때 매우 유용한 패턴이다.  


![Decorator](https://github.com/parknnna/designPattern/assets/69619672/938866c4-6859-49be-92fe-c4c99cee081b)


### 장식자 패턴의 구성요소
* Component (CakeComponent)
  * 인터페이스를 정의한다
* ConcreateComponent (CakeConcreteComponent)
  * 인터페이스에 정의 실제를 구현한다
* Decorator (CakeComponentDecorator)
  * 컴포넌트를 참조하며 인터페이스를 일치화한다
* ConcreateDecorator (Strawberry, Chocolate, Mint)
  * 확장 및 추가되는 기능을 작성한다.
