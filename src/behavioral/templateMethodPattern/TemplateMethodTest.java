package behavioral.templateMethodPattern;

import org.junit.jupiter.api.Test;

public class TemplateMethodTest {

    @Test
    void teamTest() {
        OrderProcessTemplate netOrder = new NetOrder();
        netOrder.processOrder(true);
        System.out.println();
        OrderProcessTemplate storeOrder = new StoreOrder();
        storeOrder.processOrder(true);
    }

}
