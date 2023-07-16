package behavioral.mementoPattern;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class MementoTest {

    @Test
    void teamTest() {
        List<Life.Memento> savedTimes = new ArrayList<>();
        Life life = new Life();

        life.setTime("1000 B.C.");
        savedTimes.add(life.saveToMemento());
        life.setTime("1000 A.D.");
        savedTimes.add(life.saveToMemento());
        life.setTime("2000 A.D.");
        savedTimes.add(life.saveToMemento());
        life.setTime("4000 A.D.");
        savedTimes.add(life.saveToMemento());

        life.restoreFromMemento(savedTimes.get(0));
    }

}
