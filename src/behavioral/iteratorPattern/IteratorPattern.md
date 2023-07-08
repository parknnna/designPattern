## Java Design Pattern

## 반복자 패턴(Iterator Pattern)

```
반복자 패턴은 내부 구조를 노출하지 않고 집합체를 통해 원소 객체에 순차적으로 접근할 수 있는 방법을 제공한다.
```

### 반복자 패팬이란?
* 반복자 패턴은 순한 알고리즘이 실제 구현된 객체에 의존하지 않고, 독립적인 동작을 유지하기 위해 객체의 내부 메서드에 직접 접근하지 않는다. 대신 반복자의 메서드를 호출하여 처리한다.


### 반복자 패턴의 구조
* Iterator
  * 집합체의 요소들을 순서대로 검색하기 위한 인터페이스
* ConcreateIterator
  * Iterator 인터페이스 구현
* Aggregate
  * 여러 요소들로 이루어져 있는 집합체
* ConcreateAggregate
  * Aggreagate 인터페이스를 구현하는 클래스

### 반복자 패턴 구조
![Iterator](https://github.com/parknnna/designPattern/assets/69619672/78fcef25-0125-4f8c-b017-93a243fb74a1)
