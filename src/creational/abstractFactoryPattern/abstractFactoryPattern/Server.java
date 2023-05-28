
import java.util.*;

/**
 * 
 */
public class Server extends Computer {

    /**
     * Default constructor
     */
    public Server() {
    }

    /**
     * 
     */
    private String ram;

    /**
     * 
     */
    private String hdd;

    /**
     * 
     */
    private String cpu;

    /**
     * @param ram 
     * @param hdd 
     * @param cpu
     */
    public void Server(String ram, String hdd, String cpu) {
        // TODO implement here
    }

    /**
     * @return
     */
    public String getRAM() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public String getHDD() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public String getCPU() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public abstract String getRAM();

    /**
     * @return
     */
    public abstract String getHDD();

    /**
     * @return
     */
    public abstract String getCPU();

}