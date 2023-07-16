package creational.prototypePattern;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {
	private final List<String> empList;

	public Employees() {
		empList = new ArrayList<>();
	}

	public Employees(List<String> list) {
		this.empList = list;
	}

	public void loadData() {
		empList.add("Ann");
		empList.add("David");
		empList.add("John");
		empList.add("Methew");
	}
	
	public List<String> getEmpList() {
		return empList;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		List<String> temp = new ArrayList<>();
		for (String str : this.empList) {
			temp.add(str);
		}
		return new Employees(temp);
	}
}
