package behavioral.statePattern;

import behavioral.observerPattern.AverageScoreDisplay;
import behavioral.observerPattern.CircketData;
import behavioral.observerPattern.CurrentScoreDisplay;
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
