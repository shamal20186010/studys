/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoryPattern;

import com.sun.org.apache.xml.internal.utils.StringComparable;

/**
 *
 * @author Sharmal
 */
public class A {
    
   
}

interface Mammal{
        void drinkMilk();
    }
class Human implements Mammal{

    @Override
    public void drinkMilk() {
        System.out.println("Human Drinking");
    }

}

class Zeebra implements Mammal{

    @Override
    public void drinkMilk() {
        System.out.println("Zeebra Drinking");
    }
 
}
class MammalFactory{
    public static Mammal getMammal(String MammalType){
        if (MammalType == null) {
            return null;
        }else if(MammalType.equals("Human",StringComparison.currentCultureIgnoreCase)){
        
    }
    }
}