package behavioral.commandPattern;

public class ComputerOffCommand implements Command {
    private final Computer computer;

    public ComputerOffCommand(Computer computer) {
        this.computer = computer;
    }
    
    @Override
    public void execute() {
        computer.turnOff();
    }
}