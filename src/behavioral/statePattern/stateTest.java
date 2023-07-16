package behavioral.statePattern;

import org.junit.jupiter.api.Test;

public class stateTest {

    @Test
    void teamTest() {
        AlertStateContext stateContext = new AlertStateContext();
        stateContext.alert();
        stateContext.setState(new Slient());
        stateContext.alert();
    }

}
