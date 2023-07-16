package behavioral.mediatorPattern;

import behavioral.iteratorPattern.Team;
import behavioral.iteratorPattern.Worker;
import behavioral.iteratorPattern.WorkerType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Iterator;

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
