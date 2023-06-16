package structural.decoratorPattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecoratorPatternTest {

    @Test
    void decoratorPatternTest1() {
        CakeComponent cakeComponent = new Chocolate(new CakeConcreteComponent());
        assertEquals("초코 케이크", cakeComponent.decorate());
    }

    @Test
    void decoratorPatternTest2() {
        CakeComponent cakeComponent = new Chocolate(new Chocolate(new Strawberry(new CakeConcreteComponent())));
        assertEquals("초코 초코 딸기 케이크", cakeComponent.decorate());
    }

    @Test
    void decoratorPatternTest3() {
        CakeComponent cakeComponent = new Mint(new Strawberry(new Chocolate(new CakeConcreteComponent())));
        assertEquals("민트 딸기 초코 케이크", cakeComponent.decorate());
    }


}
