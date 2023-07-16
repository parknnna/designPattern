## Java Design Pattern

## 메멘토 패턴(Memento Pattern)

```
메멘토 패턴은 객체의 상태 정보를 가지는 클래스를 따로 생성하여, 객체의 상태를 저장하거나 이전 상태로 복원할 수 있게 해주는 패턴,
예로 바둑, 오목, 체스 등의 보드게임에서 '무르기' 기능을 구현할때 사용되기도 한다.
```

### 메멘토 패팬이란?
* 캡슐화를 유지하며 객체 내부 상태를 외부에 저장
* 이전 상태의 객체를 저장하기 위한 Originator가 클경우 많은 메모리가 필요함.

### 메멘토 패턴의 구조
* Originator : 객체의 상태를 저장, Memento 객체를 생성하며 후에 Memento를 사용하여 실행 취소(undo)를 할 수 있음
* Memento : Originator의 상태를 유지하는 객체(POJO)
* Caretaker : 마치 게임의 세이브포인트처럼 복수의 Memento의 상태를 유지해주는 객체

### 메멘토 패턴 구조
![mementoPattern](https://github.com/parknnna/designPattern/assets/69619672/1bf307c2-4fd6-4a51-a47e-4decf1249587)


