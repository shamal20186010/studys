package hashMAp;

import java.util.HashMap;

/**
 *
 * @author Sharmal
 */
public class Car {
    public static void main(String[] args) {
        HashMap <String , String> car = new HashMap<String , String>();
        car.put("Volvo", "Volvo086");
        car.put("Toyota", "CHR");
        
        
        for (String a : car.keySet()) {
            System.out.println("key "+ a +" = Value "+car.get(a));
        }
    }
}
