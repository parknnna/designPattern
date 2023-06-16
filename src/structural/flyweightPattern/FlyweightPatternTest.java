package structural.flyweightPattern;

import org.junit.jupiter.api.Test;

public class FlyweightPatternTest {

    @Test
    void flyweightTest() {
        Factory factory = new Factory();
        factory.getButton("A").button();
        factory.getButton("B").button();
        factory.getButton("C").button();
        factory.getButton("D").button();
    }

}
