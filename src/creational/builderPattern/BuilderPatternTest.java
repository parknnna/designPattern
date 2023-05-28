package creational.builderPattern;

import org.junit.jupiter.api.Test;

class BuilderPatternTest {

	@Test
	void builderPatternTest() {
		Member member = Member.builder()
						.name("테스터")
						.age(20)
						.address("서울시 관악구")
						.build();
		
		System.out.println(member.toString());
		
	}

}
