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
