package behavioral.mediatorPattern;

import org.junit.jupiter.api.Test;

public class MediatorTest {

    @Test
    void teamTest() {
        IATCMediator atcMediator = new ATCMediator();
        Flight cptJack = new Flight(atcMediator);
        Runway runnerWay = new Runway(atcMediator);
        atcMediator.registerFilght(cptJack);
        atcMediator.registerRunway(runnerWay);
        cptJack.getReady();
        runnerWay.land();
        cptJack.land();
    }

}
