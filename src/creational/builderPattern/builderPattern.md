## Java Design Pattern



## 빌더 패턴(Builder Pattern)

빌더 패턴은 복잡한 객체를 생성하는 방법을 정의하는 클래스와 표현하는 방법을 정의하는 클래스를 별도로 분리하여, 서로 다른 표현이라도 이를 생성할 수 있는 동일한 절차를 제공하는 패턴이다.

빌더 패턴은 생성 패턴으로 인스턴스를 만드는 절차를 추상화하는 패턴으로, 특히 빌더 패턴은 많은 Optional한 멤버 변수(혹은 파라미터)나 지속성 없는 상태 값들에 대해 처리해야 할 때 큰 장점을 가지고 있다. 

롬복의 @Builder 어노테이션을 사용하여 쉽게 구현할 수 있다.


*Member.java*

```java
package creational.builderPattern;

public class Member {

	private String name;
	private int age;
	private String address;
	
	private Member(Builder builder) {
		this.name = builder.name;
		this.age = builder.age;
		this.address = builder.address;
	}

	public static Builder builder() {
		return new Builder();
	}

	public static class Builder {
		private String name;
		private int age;
		private String address;

		private Builder() {};

		public Builder name(String name) {
			this.name = name;
			return this;
		}

		public Builder age(int age) {
			this.age = age;
			return this;
		}

		public Builder address(String address) {
			this.address = address;
			return this;
		}

		// 마지막에 build 메소드를 실행하면 this가 return 되도록 구현
		public Member build() {
			return new Member(this);
		}
	}
	
	@Override
	public String toString() {
		return String.format("name : %s, age : %s, address : %s", this.name, this.age, this.address);
	}
}

/**
 * 롬복 어노테이션을 이용하여 구현하는 방법 
 */
//@Builder
//@toString
//public class Member {
//
//	private String name;
//	private int age;
//	private String address;
//	
//}

```


