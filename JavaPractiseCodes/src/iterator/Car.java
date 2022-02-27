package iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Sharmal
 */
public class Car {
    public static void main(String[] args) {
        ArrayList <String> car = new ArrayList<String>();
        car.add("Volvo");
        car.add("CHR");
        
        
       Iterator<String> it = car.iterator();
       
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
        
        
    }
}
