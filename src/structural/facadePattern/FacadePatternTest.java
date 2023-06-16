package structural.facadePattern;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FacadePatternTest {

    @Test
    void carDriveTest() {
        String key = "CAR_SECRET_KEY";
        Car car = new HCar(new HEngine(), key);
        car.open(key);
        car.drive(key);
        car.stop();
    }
    
    // 잘못된 키 테스트
    @Test
    void carDriveInvalidTest() {
        String key = "CAR_SECRET_KEY";
        Car car = new HCar(new HEngine(), key);

        Assertions.assertThrows(CarKeyNotMatchException.class, () -> car.open("INVALID_KEY"));
    }

}
