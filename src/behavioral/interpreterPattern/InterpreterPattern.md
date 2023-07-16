## Java Design Pattern

## 책임 연쇄 패턴(Chain of Responsibility Pattern)

```
클라이언트로부터의 요청을 처리할 수 있는 처리객체를 집합(chain)으로 만들어 부여함으로 결합을 느슨하게 하기 위해 만들어진 디자인 패턴 
```

### 책임 연쇄 패팬이란?
* 명령 객체와 일련의 처리 객체를 포함하는 디자인 패턴
* 요청을 처리할 수 있는 처리객체를 Chain으로 만들어 결합을 느슨하게 하기 위해 사용
* 요청을 처리할 수 있는 객체가 여러개 이고 처리객체가 특정적이지 않을 경우 권장
* 객체지향 개발에서 어떤 조건에 따라 코드가 분기되는 이벤트에 활욜할 수 있다

### 인터프리터 패턴의 구조
* AbstractExpression : interpret()를 정의
* TerminalExpression : interpret()를 구현
* NonTerminalExpression : Non-Terminal의  interpret()를 구현
* Context : String 표현식이어야 하며, 인터프리터에 보내는 정보
* Client : interpret()를 호출

### 인터프리터 패턴의 특징
#### 장점
* 문법의 추가 및 수정, 구현이 쉬워진다.

#### 단점
* 복잡한 문법의 경우 관리 및 유지가 어렵다.

### 커맨드 패턴 구조
![InterpreterPattern](https://github.com/parknnna/designPattern/assets/69619672/eb567bf5-9aca-4712-b460-b71442362592)


