package behavioral.commandPattern;

import org.junit.jupiter.api.Test;

public class CommandTest {

    @Test
    void commandTest() {
        Computer computer = new Computer();    //컴퓨터는 리시버

        //컴퓨터 객체 생성
        ComputerOnCommand computerOnCmd = new ComputerOnCommand(computer);
        ComputerOffCommand computerOffCmd = new ComputerOffCommand(computer);

        Button btn = new Button(computerOnCmd);    //버튼이 인보커 역할
        btn.pressButton();
        btn.setCommand(computerOffCmd);
        btn.pressButton();
    }

}
