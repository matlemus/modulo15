/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package control;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SISTEMAS
 */
public class ExamThread extends Thread{
    @Override
    public void run(){
        Thread t = new simuladorThread();
        t.start();
        try {
            t.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(ExamThread.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("El hilo esta vivo?"+ t.isAlive());
        System.out.println("Hacer examen");
    }
}
