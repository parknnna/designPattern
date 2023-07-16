package behavioral.mediatorPattern;

public interface IATCMediator {
    public void registerRunway(Runway runway);
    public void registerFilght(Flight flight);
    public boolean isLandingOK();
    public void setLandingStatus(boolean status);
}