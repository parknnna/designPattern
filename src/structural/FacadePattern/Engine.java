package structural.FacadePattern;

public interface Engine {
    void start();
 
    void stop();
 
    EngineStatus status();
}