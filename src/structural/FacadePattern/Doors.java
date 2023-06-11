package structural.FacadePattern;

public interface Doors {
    void locks(String key);
 
    void unlocks(String key);
 
    CarKey getKey();
}