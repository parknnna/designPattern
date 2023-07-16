package behavioral.mediatorPattern;

public class ATCMediator implements IATCMediator{
    private Flight flight;
    private Runway runway;
    public boolean land;
    
    @Override
    public void registerRunway(Runway runway) {
        this.runway = runway;
    }
 
    @Override
    public void registerFilght(Flight flight) {
        this.flight = flight;
    }
 
    @Override
    public boolean isLandingOK() {
        return land;
    }
 
    @Override
    public void setLandingStatus(boolean status) {
        land = status;
    }
}