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