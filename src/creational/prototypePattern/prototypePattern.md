## Java Design Pattern



## 프로토타입 패턴(Prototype Pattern)

프로토타입패턴은 객체를 생성하는데 비용이들고, 이미 유사한 객체가 존재하는 경우에 사용된다.

자바에서 제공하는 clone메소드를 사용하기 때문에 생성하고자 하는 객체에 clone에 대한 Override를 요구한다. 이때, 주의할 점은 반드시 생성하고자 하는 객체의 클래스에서 clone메소드가 정의되어있어야한다.


*Employees.java*

```java
package creational.prototypePattern;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {
	private List<String> empList;

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

	@Override
	public Object clone() throws CloneNotSupportedException {
		List<String> temp = new ArrayList<>();
		for (String str : this.empList) {
			temp.add(str);
		}
		return new Employees(temp);
	}
}

```


