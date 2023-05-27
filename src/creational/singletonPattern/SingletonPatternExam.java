package creational.singletonPattern;

public class SingletonPatternExam {

	public static void main(String[] args) {
		CompanyInfo company1 = CompanyInfo.getInstance();
		company1.setCompanyName("naver");
		company1.setCompanyAddr("구로구");
		
		System.out.println(company1.toString());
		
		CompanyInfo company2 = CompanyInfo.getInstance();
		company2.setCompanyName("kakao");
		company2.setCompanyAddr("판교");
		
		System.out.println(company1.toString());
		
	}
	
}
