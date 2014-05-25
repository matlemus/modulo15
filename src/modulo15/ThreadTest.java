/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modulo15;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SISTEMAS
 */
public class ThreadTest {
    public static void main(String[] args) {
        HelloRunner r = new HelloRunner();
        Thread t = new Thread(r);
        Thread t1 = new Thread(r);
        t.setName("Einstein");
        t1.setName("Mozart");
        t.setPriority(Thread.MAX_PRIORITY); //le da la prioridad mas alta al hilo
        t.setPriority(Thread.MIN_PRIORITY);
        t.start();        
        try {
            t.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        //t.yield();
        t1.start();
    }
}

class HelloRunner implements Runnable{
int i=0;
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        
        for (; i < 50; i++) {
            System.out.println(name +" : "+ i);
           
        }
    }
}


