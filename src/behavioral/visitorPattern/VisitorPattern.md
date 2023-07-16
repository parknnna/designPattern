## Java Design Pattern

## 방문자 패턴(Visitor Pattern)

```
방문자 패턴은 로직을 객체 구조에서 분리 시키는 디자인 패턴,
비슷한 종류의 객체들을 가진 그룹에서 작업을 수행해야 할 때 주로 사용되는 패턴.
```

### 방문자 패턴의 구조
- Client : 명령을 보냅니다.
- Visitor : 명령을 수행하기 위해 필요한 메소드를 정의하는 인터페이스입니다.
- ConcreteVisitor : 명령을 수행하는 메소드를 구현합니다.
- Element : Visit를 사용할 수 있는지 확인하는 accept 메소드를 정의하는 인터페이스입니다.
- ConcreteElement : Visitable에서 정의된 accept 메소드를 구현하며 Visitor객체는 이 객체를 통하여 명령이 전달됩니다.

### 방문자 패턴의 특징
#### 장점
* 로직이 추가/변경되면 그 로직이 포함된 클래스를 찾아가며 변경하지 않고 방문자 객체만 변경하면 됩니다.

#### 단점
* 방문자 인터펭스에 구현해야할 로직이 많으면 유지보수에 어려움이 있습니다.
* visit 메소드의 return 타입을 각각 파악하고 있어야 합니다.

### 방문자 패턴 구조
![visitorPatturn](https://github.com/parknnna/designPattern/assets/69619672/f1a2cb3b-8b40-41c1-b3cb-56a954547e0c)


