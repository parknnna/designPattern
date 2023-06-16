package structural.facadePattern;

public interface Engine {
    void start();
 
    void stop();
 
    EngineStatus status();
}