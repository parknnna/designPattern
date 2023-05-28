## Java Design Pattern



## 추상 팩토리 패턴(Abstract Factory Pattern)

추상 팩토리 패턴은 상세화된 서브클래스를 정의하지 않고도 서로 관련성이 있거나 독립적인 여러 객체의 군을 생성하기 위한 인터페이스를 제공하는 패턴이다.

추상 팩토리 패턴은 객체의 생성, 표현, 구성과는 무관하게 시스템을 독립적으로 만들고자 할 때 유용한 패턴이다. 여러 클래스들 중에 하나를 선택해서 시스템을 설정해야하고 한번 구성한 제품을 다른것으로 대체할 수 있을 때 사용한다.

추상 팩토리 패턴과 추상 메서드 패턴은 다른 패턴이다. 내가 생각했을 때 추상 팩토리 패턴의 가장 큰 장점은 관련성이 있는 독립적인 여러 객체의 군을 유연하게 변경할 수 있다는 점이다.

<img width="942" alt="classdiagram" src="https://github.com/parknnna/designPattern/assets/69619672/02bba497-3fea-4f07-8725-275f482a1fc6">



*Computer.java*

```java
package creational.abstractFactoryPattern;

public abstract class Computer {

	public abstract String getRAM();

	public abstract String getHDD();

	public abstract String getCPU();

	@Override
	public String toString() {
		return String.format("ram : %s, hdd : %s, cpu : %s", getRAM(), getHDD(), getCPU());
	}
}
```

*PC.java*

```java
package creational.abstractFactoryPattern;

public class PC extends Computer {

	private String ram;
	private String hdd;
	private String cpu;

	public PC(String ram, String hdd, String cpu) {
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	@Override
	public String getRAM() {
		return this.ram;
	}

	@Override
	public String getHDD() {
		return this.hdd;
	}

	@Override
	public String getCPU() {
		return this.cpu;
	}

}

```

*Server.java*

```java
package creational.abstractFactoryPattern;

public class Server extends Computer {

	private String ram;
	private String hdd;
	private String cpu;

	public Server(String ram, String hdd, String cpu) {
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	@Override
	public String getRAM() {
		return this.ram;
	}

	@Override
	public String getHDD() {
		return this.hdd;
	}

	@Override
	public String getCPU() {
		return this.cpu;
	}

}

```

*ComputerAbstractFactory.java*

```java
package creational.abstractFactoryPattern;

public interface ComputerAbstractFactory {

	public Computer createComputer();

}

```

*PCFactory.java*

```java
package creational.abstractFactoryPattern;

public class PCFactory implements ComputerAbstractFactory {

	private String ram;
	private String hdd;
	private String cpu;

	public PCFactory(String ram, String hdd, String cpu) {
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	@Override
	public Computer createComputer() {
		return new PC(ram, hdd, cpu);
	}

}
```

*ServerFactory.java*

```java
package creational.abstractFactoryPattern;

public class ServerFactory implements ComputerAbstractFactory {

	private String ram;
	private String hdd;
	private String cpu;

	public ServerFactory(String ram, String hdd, String cpu) {
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	@Override
	public Computer createComputer() {
		return new Server(ram, hdd, cpu);
	}

}
```

*ComputerFactory.java*

```java
package creational.abstractFactoryPattern;

public class ComputerFactory {
	 
	public static Computer getComputer(ComputerAbstractFactory factory){
		return factory.createComputer();
	}
}
```

*AbstractFactoryTest.java*

```java
package creational.abstractFactoryPattern;

import org.junit.jupiter.api.Test;

class AbstractFactoryTest {

	@Test
	void abstractFactoryTest() {
		
		Computer pc = ComputerFactory.getComputer(new PCFactory("2 GB","500 GB","2.4 GHz"));
		Computer server = ComputerFactory.getComputer(new ServerFactory("16 GB","1 TB","2.9 GHz"));
		System.out.println("AbstractFactory PC Config::"+pc); // AbstractFactory PC Config::ram : 2 GB, hdd : 500 GB, cpu : 2.4 GHz
		System.out.println("AbstractFactory Server Config::"+server); // AbstractFactory Server Config::ram : 16 GB, hdd : 1 TB, cpu : 2.9 GHz

	}

}

```



