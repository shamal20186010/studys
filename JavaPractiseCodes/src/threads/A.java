package threads;

/**
 *
 * @author Sharmal
 */
class A implements Runnable {

    public void run() {
        for (int i = 0; i < 100; i++) {
            {
                System.out.println("Hello");
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                }
            }

        }
    }
}

class B implements Runnable {

    public void run() {
        for (int i = 0; i < 100; i++) {
            {
                System.out.println("World");
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                }
            }
        }
    }
}

class Test {

    public static void main(String[] args) {
//        A obj1 = new A();
//        Thread t1 = new Thread(obj1);
//        t1.start();
//        try {
//            Thread.sleep(50);
//        } catch (Exception e) {
//        }
//        B obj2 = new B();
//        Thread t2 = new Thread(obj2);
//        t2.start();

        for (int i = 0; i < 3; i++) {
            MyThread mt = new MyThread(i);
            Thread t1 = new Thread(mt);
            t1.start();
            try {
                 t1.join();
            } catch (Exception e) {
            }
            while (t1.isAlive()) {
                System.out.println("Waiting");
            }
        }

    }
}
