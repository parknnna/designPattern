## Java Design Pattern

## 템플릿메소드 패턴(TemplateMethod Pattern)

```
상위 클래스에서 처리의 흐름을 제어하며, 하위클래스에서 처리의 내용을 구체화하는 디자인 패턴입니다.
공통되는 사항은 상위 추상 클래스에서 구현하며, 각 객체마다 다른 부분은 하위 클래스에서 구현합니다.
상속을 통한 확장 개발 방법으로 코드의 중복을 줄이고, 리팩토링(Refactoring)에 유리하여 가장 많이 사용되는 패턴 중 하나입니다. 
```

### 템플릿메소드 패턴의 구조
* Abstract Class : 추상 클래스로 templateMethod를 정의합니다.
* Concrete Class : 부모 클래스에서 abstract로 정의된 templateMethod를 구현합니다.

### 템플릿메소드 패턴의 특징
#### 장점
* 코드 중복 감소
* 자식 클래스의 역할을 감소시키면서 핵심 로직 관리 용이
* 객체 추가 및 확장 쉽게 가능

#### 단점
* 추상메소드가 너무 많아지면 클래스 관리 복잡
* 추상클래스와 구현클래스간 복잡성 증대

### 템플릿메소드 패턴 구조
![templateMethodPattern](https://github.com/parknnna/designPattern/assets/69619672/e65933d3-1241-4f3e-8aef-db28d85bdcdd)


