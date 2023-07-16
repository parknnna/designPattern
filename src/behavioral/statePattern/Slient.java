package behavioral.statePattern;

public class Slient implements MobileAlertState{
 
    @Override
    public void alert(AlertStateContext ctx) {
        System.out.println("Silent");
    }
 
}