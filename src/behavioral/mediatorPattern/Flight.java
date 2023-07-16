package behavioral.mediatorPattern;

public class Flight implements Command {
    private IATCMediator atcMediator;
    
    public Flight(IATCMediator atcMediator) {
        this.atcMediator = atcMediator;
    }
    
    @Override
    public void land() {
        if (atcMediator.isLandingOK()) {
            System.out.println("Successfylly Landed.");
            atcMediator.setLandingStatus(true);
        } else {
            System.out.println("Waiting for Landing.");
        }
    }
 
    public void getReady() {
        System.out.println("Ready for landing");
    }
}
