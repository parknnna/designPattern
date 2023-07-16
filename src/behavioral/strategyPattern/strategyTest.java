package behavioral.strategyPattern;

import behavioral.statePattern.AlertStateContext;
import behavioral.statePattern.Slient;
import org.junit.jupiter.api.Test;

public class strategyTest {

    @Test
    void teamTest() {
        JumpBehavior shortJump = new ShortJump();
        JumpBehavior LongJump = new LongJump();
        KickBehavior tornadoKick = new TornadoKick();

        Fighter ken = new Ken(tornadoKick, shortJump);
        ken.display();

        ken.punch();
        ken.kick();
        ken.jump();

        ken.setJumpBeahvior(LongJump);
        ken.jump();
    }

}
