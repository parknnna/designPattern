package behavioral.statePattern;

public class Vibration implements MobileAlertState{
 
    @Override
    public void alert(AlertStateContext ctx) {
        System.out.println("Vibration");
    }
 
}