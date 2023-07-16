package behavioral.commandPattern;

public class ComputerOnCommand implements Command{
    private final Computer computer;

    public ComputerOnCommand(Computer computer) {
        this.computer = computer;
    }
    
    @Override
    public void execute() {
        computer.turnOn();
    }
}