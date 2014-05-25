/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package comunicacion;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SISTEMAS
 */
public class Producer implements Runnable{
    private SyncStack theStack;
    private int num;
    private static int counter = 1;
    public Producer(SyncStack s){
        theStack =s;
        num = counter ++;
    }
    @Override
    public void run() {
        char c;
        for (int i = 0; i < 5; i++) {
            try {
                c =(char)(Math.random()*26+'A');
                theStack.push(c);
                System.out.println("Productor: "+ num + " : " + c );            
                Thread.sleep((int)Math.random()*300);
            } catch (InterruptedException ex) {
                Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
