package structural.FacadePattern;

public class CarKey {
    private String key;
 
    public CarKey(String key) {
        this.key = key;
    }
 
    public boolean turns(String key) {
        return this.key.equals(key);
    }
}
