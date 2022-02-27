package hashSet;

import java.util.HashSet;

/**
 *
 * @author Sharmal
 */
public class HashSetDemo {
    public static void main(String[] args) {
        
        HashSet<Integer> myHashSet = new HashSet<>();
        
        myHashSet.add(1);
        myHashSet.add(10);
        
        for (Integer a : myHashSet) {
            System.out.println(a);
            
        }
    }
}
