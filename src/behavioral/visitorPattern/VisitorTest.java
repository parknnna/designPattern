package behavioral.visitorPattern;

import behavioral.templateMethodPattern.NetOrder;
import behavioral.templateMethodPattern.OrderProcessTemplate;
import behavioral.templateMethodPattern.StoreOrder;
import org.junit.jupiter.api.Test;

public class VisitorTest {

    @Test
    void teamTest() {
        OrderProcessTemplate netOrder = new NetOrder();
        netOrder.processOrder(true);
        System.out.println();
        OrderProcessTemplate storeOrder = new StoreOrder();
        storeOrder.processOrder(true);
    }

}
