/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads.synchroniz;

/**
 *
 * @author Sharmal
 */
public class TestSyncroniz {
    public static void main(String[] args) {
        Table t = new Table();
        MyThread1 t1 = new MyThread1(t);
        MyThread2 t2 = new MyThread2(t);
        t1.start();
        t2.start();
    }
    
}
