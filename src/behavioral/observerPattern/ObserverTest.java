package behavioral.observerPattern;

import org.junit.jupiter.api.Test;

public class ObserverTest {

    @Test
    void teamTest() {
        AverageScoreDisplay averageScoreDisplay = new AverageScoreDisplay();
        CurrentScoreDisplay currentScoreDisplay = new CurrentScoreDisplay();
        CircketData circketData = new CircketData();
        circketData.registerObserver(averageScoreDisplay);
        circketData.registerObserver(currentScoreDisplay);

        circketData.dataChanged();

        System.out.println("\n--------- Remove AverageScoreDisplay ---------");
        circketData.unregisterObserver(averageScoreDisplay);
        circketData.dataChanged();
    }

}
