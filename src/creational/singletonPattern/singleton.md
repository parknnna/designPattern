## Java Design Pattern



## 싱글톤 패턴(Singleton Pattern)

싱글톤(Singleton) 패턴의 정의는 단순하다. 객체의 인스턴스가 오직 1개만 생성되는 패턴을 의미한다. 


> 싱글톤 패턴 사용 이유?

가장 먼저 떠올릴 수 있는 이점은 아무래도 메모리 측면일 것이다. 최초 한번의 new 연산자를 통해서 고정된 메모리 영역을 사용하기 때문에 추후 해당 객체에 접근할 때 메모리 낭비를 방지할 수 있다. 뿐만 아니라 이미 생성된 인스턴스를 활용하니 속도 측면에서도 이점이 있다고 볼 수 있다.

또다른 이점은 다른 클래스 간에 데이터 공유가 쉽다는 것이다. 싱글톤 인스턴스가 전역으로 사용되는 인스턴스이기 때문에 다른 클래스의 인스턴스들이 접근하여 사용할 수 있다. 하지만 여러 클래스의 인스턴스에서 싱글톤 인스턴스의 데이터에 동시에 접근하게 되면 동시성 문제가 발생할 수 있으니 이점을 유의해서 설계하는 것이 좋다.

밑 코드는 싱글톤 패턴의 간단한 예제이다.

*SingletonPatternExam.java*

```java
package creational.singletonPattern;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SingletonPatternTest {

	@Test
	void test() {
		CompanyInfo company1 = CompanyInfo.getInstance();
		company1.setCompanyName("naver");
		company1.setCompanyAddr("구로구");
		
		System.out.println(company1.toString()); // companyName : naver, companyAddr : 구로구
		
		CompanyInfo company2 = CompanyInfo.getInstance();
		company2.setCompanyName("kakao");
		company2.setCompanyAddr("판교");
		
		System.out.println(company1.toString()); // companyName : kakao, companyAddr : 판교

		assertEquals(company1, company2);

        /**
         * 위와 같이 company1에 companyName과 companyAddr를 "naver", "구로구"로 값을 지정 후
         * company2에 companyName과 companyAddr를 "kakao", "판교"로 값을 지정 해주었는데 
         * company1의 값이 "kakao", "판교"로 바뀐걸 확인할 수 있다.
         * 즉 데이터를 공유 한다는 걸 알수있으며, [company1 == company2]가 true 인것을 보면 같은 객체 임을 확인할 수 있다.
         */
		
	}
	
}
```

*CompanyInfo.java*

```java
package creational.singletonPattern;

public class CompanyInfo {
	private static CompanyInfo innstance;

	private String companyName;
	private String companyAddr;

	private CompanyInfo() {}

	public static CompanyInfo getInstance() {
		if (innstance == null) {
			synchronized (CompanyInfo.class) {
				innstance = new CompanyInfo();
			}
		}

		return innstance;
	}

	// getter, setter
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyAddr() {
		return companyAddr;
	}

	public void setCompanyAddr(String companyAddr) {
		this.companyAddr = companyAddr;
	}
	
	@Override
	public String toString() {
		return String.format("companyName : %s, companyAddr : %s", this.companyName, this.companyAddr);
	}
}

```

