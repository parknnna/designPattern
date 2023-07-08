package behavioral.iteratorPattern;

import java.util.Iterator;
 
public interface Aggregate<T> {
    Iterator<T> iterator();
}
