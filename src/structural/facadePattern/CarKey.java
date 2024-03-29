package structural.facadePattern;

public class CarKey {
    private final String key;
 
    public CarKey(String key) {
        this.key = key;
    }
 
    public boolean turns(String key) {
        return this.key.equals(key);
    }
}
