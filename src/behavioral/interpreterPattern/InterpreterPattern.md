## Java Design Pattern

## 인터프리터 패턴(Interpreter Pattern)

```
문법 규칙을 클래스화 한 구조로, 일련의 규칙으로 정의된 문법적 언어를 해석하는 패턴(SQL, CHELL..)
인터프리터 패턴은 SQL과 같은 계층적 언어를 해석하기 위해 계층 구조를 표현할 수 있다.
```

### 인터프리터 패팬이란?
* CS에서는 사람이 작성한 코드를 하드웨어가 이해할 수 있도록 변환해주는 장치를 인터프리터라 한다. <br/> 자주 등장하는 문제 -> 간단한 언어로 정의하고 재사용하는 페턴
* 반복되는 문제 패턴을 언어 또는 문법으로 정의하고 확장할 수 있다. ex) 정규표현식

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

### 인터프리터 패턴 구조
![InterpreterPattern](https://github.com/parknnna/designPattern/assets/69619672/eb567bf5-9aca-4712-b460-b71442362592)


