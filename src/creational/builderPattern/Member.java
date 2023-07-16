package creational.builderPattern;

public class Member {

	private final String name;
	private final int age;
	private final String address;
	
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
