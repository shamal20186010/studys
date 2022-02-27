package abstraction;

abstract class Shape {

    abstract public int getArea();
}

class Rettangel extends Shape {

    int lenth, width;

    @Override
    public int getArea() {
        return (lenth * width);
    }

}

class Circle {

    int radius;

    public int getArea() {
        return (int) (3.14 * radius * radius);
    }

}

public class Main {

    public static void main(String[] args) {

        Rettangel r1 = new Rettangel();
        r1.lenth = 20; 
        r1.width = 40;
        System.out.println("Rectangel Area =" + r1.getArea());

        Circle c1 = new Circle();
        c1.radius = 20;
        System.out.println("Circle Area = " + c1.getArea());
    }
}
