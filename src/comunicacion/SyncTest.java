/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package comunicacion;

/**
 *
 * @author SISTEMAS
 */
public class SyncTest {
    public static void main(String[] args) {
        SyncStack stack = new SyncStack();
        Producer prod1 = new Producer(stack);
        Thread prod1T = new Thread(prod1);
        prod1T.start();
        
        Producer prod2 = new Producer(stack);
        Thread prod2T = new Thread(prod1); 
        prod2T.start();
        
        Consumer c1 = new Consumer(stack);
        Thread c1T = new Thread(c1);
        c1T.start();
        
        Consumer c2 = new Consumer(stack);
        Thread c2T = new Thread(c2);        
        c2T.start();
        
        
    }
}
