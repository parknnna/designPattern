package structural.compositePattern;

import org.junit.jupiter.api.Test;

public class CompositePatternTest {
    @Test
    void compositePatternTest() {
        Shape triangle = new Triangle();
        Shape triangle2 = new Triangle();
        Shape circle = new Circle();

        ShapeComposite shapeComposite = new ShapeComposite();
        shapeComposite.add(triangle);
        shapeComposite.add(triangle2);
        shapeComposite.add(circle);

        shapeComposite.print();
        shapeComposite.draw("RED");
        shapeComposite.print();
        shapeComposite.move(1, 1);
        shapeComposite.print();
        shapeComposite.move(2, -3);
        shapeComposite.print();
    }
}
