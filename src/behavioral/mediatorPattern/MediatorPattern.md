## Java Design Pattern

## 중재자 패턴(Mediator Pattern)

```
클라이언트로부터의 요청을 처리할 수 있는 처리객체를 집합(chain)으로 만들어 부여함으로 결합을 느슨하게 하기 위해 만들어진 디자인 패턴 
```

### 중재자 패팬이란?
* 명령 객체와 일련의 처리 객체를 포함하는 디자인 패턴
* 요청을 처리할 수 있는 처리객체를 Chain으로 만들어 결합을 느슨하게 하기 위해 사용
* 요청을 처리할 수 있는 객체가 여러개 이고 처리객체가 특정적이지 않을 경우 권장
* 객체지향 개발에서 어떤 조건에 따라 코드가 분기되는 이벤트에 활욜할 수 있다

### 중재자 패턴의 구조
* Mediator : Colleague 객체간의 상호작용을 위한 인터페이스를 정의
* ConcreteMediator : Mediator의 인터페이스를 구현하여 객체간의 상호작용을 조정
* Colleague : 다른 Colleague와의 상호작용을 위한 인터페이스를 정의
* ConcreteColleague : Colleague의 인터페이스를 구현하며 Mediator를 통해 다른 Colleague와 상호작용

### 중재자 패턴의 특징
#### 장점
* 객체들간의 관계가 매우 복잡하여 객체의 재사용이 부담이 갈 경우
* 객체들간의 관계의 복잡도, 의존성 및 결합도를 감소 시킴

#### 단점
* 중재자 패턴 사용 시 중재자 객체에 권한이 집중화되어 굉장히 크며 복잡해지므로, 설계 및 중재자 객체 수정 시 주의가 필요함.

### 중재자 패턴 구조
![mediatorPattern](https://github.com/parknnna/designPattern/assets/69619672/39ba871d-417d-46f3-8f4d-5d3357da9842)

