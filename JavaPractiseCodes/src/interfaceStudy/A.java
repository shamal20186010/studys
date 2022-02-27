package interfaceStudy;


public class A {
    
}
interface C{
    public abstract int getC();
    public static final int c = 10;
}
interface D{

}

class B extends A implements C,D{

    @Override
    public int getC() {
        return c;
           
    }
    public static void main(String[] args) {
        
    }
    

}
