## Java Design Pattern



## 어댑터 패턴(Adapter Pattern)

어댑터 패턴은 기존 코드를 재사용하기 위해 내적, 외적 구조를 변환하는 작업을 처리한다.

어댑터 패턴은 코드를 재사용하기 위한 인터페이스를 처리하고 인터페이스를 활용해 보정 코드를 사용한다.

어댑터 패턴은 기능상 문제없이 동작하는 코드가 단지 인터페이스 차이 때문에 사용할 수 없는 경우 많이 응용되는 패턴이다. 또 기존 코드에 오류가 있거나 보정 작업이 필요한 경우에도 유용하다.

어댑터 패턴은 오래된 레거시 코드나 라이브러리를 재사용할 때 유용한 패턴이다. 또한 어댑터 패턴은 서로 호환되지 않는 인터페이스를 가진 코드를 결함 하여 응용 프로그램에서 동작할 수 있도록 도와준다.

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

