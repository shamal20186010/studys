package singletonPatton;

/**
 *
 * @author Sharmal
 */
public class SingleObject {

    private SingleObject() {
    }

    private static SingleObject instance = new SingleObject();

    public static SingleObject getSingleObject() {
        return instance;
    }

    public void showSomeText() {
        System.out.println("Some Text");
    }

    public static void main(String[] args) {
        SingleObject obj = SingleObject.getSingleObject();
        System.out.println(obj);
    }
}
