package behavioral.corPattern;

import org.junit.jupiter.api.Test;

public class CorTest {

    @Test
    void commandTest() {
        Chain c1 = new NegativeProcessor();
        Chain c2 = new ZeroProcessor();
        Chain c3 = new PositiveProcessor();

        c1.setNext(c2);
        c2.setNext(c3);

        c1.process(new Number(90));
        c1.process(new Number(-50));
        c1.process(new Number(0));
        c1.process(new Number(91));
    }

}
