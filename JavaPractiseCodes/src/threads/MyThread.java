
package threads;

/**
 *
 * @author Sharmal
 */
class MyThread implements Runnable{
    
    int threadNumber;
    
    public MyThread(int threadNumber) {
       this.threadNumber = threadNumber;
    }
    @Override
    public void run(){
        for (int i = 0; i < 3; i++) {
            System.out.println("Calling From "+this.threadNumber+" Run "+i);
        }
    }

    
    
}
