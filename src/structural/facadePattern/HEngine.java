package structural.facadePattern;

public class HEngine implements Engine {
    EngineStatus engineStatus;
 
    public HEngine() {
        this.engineStatus = EngineStatus.STOP;
    }
 
    @Override
    public void start() {
        this.engineStatus = EngineStatus.DRIVE;
    }
 
    @Override
    public void stop() {
        this.engineStatus = EngineStatus.STOP;
    }
 
    @Override
    public EngineStatus status() {
        return this.engineStatus;
    }
}