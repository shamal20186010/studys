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
public class MyThread1 extends Thread{
    Table t ;

    public MyThread1(Table t) {
        this.t = t;
    }
    public void run(){
        System.out.println(t);
    }
    
    
}
