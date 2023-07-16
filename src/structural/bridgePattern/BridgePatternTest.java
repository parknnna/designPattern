package structural.bridgePattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BridgePatternTest {

    @Test
    void bridgePatternTest() {
        Shape square = new Square(new Red());
        assertEquals(square.draw(), "Square drawn. Color is Red");

        Triangle blue = new Triangle(new Blue());
        assertEquals(blue.draw(), "Triangle drawn. Color is Blue");
    }
}
