package creational.prototypePattern;

import java.util.List;

import org.junit.jupiter.api.Test;

class PrototypePatternTest {

	@Test
	void prototypePatternTest() throws CloneNotSupportedException {
		Employees emps = new Employees();
		emps.loadData(); // Ann, John, Methew...

		Employees emps1 = (Employees) emps.clone();
		Employees emps2 = (Employees) emps.clone();

		List<String> list1 = emps1.getEmpList();
		list1.add("Peter");

		List<String> list2 = emps2.getEmpList();
		list2.remove("John");

		System.out.println("emps: " + emps.getEmpList());
		System.out.println("emps1: " + emps1.getEmpList());
		System.out.println("emps2: " + emps2.getEmpList());
	}

}
