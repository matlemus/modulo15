/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package control;

/**
 *
 * @author SISTEMAS
 */
public class simuladorThread extends Thread{
@Override
public void run(){
    for (int i = 0; i < 11; i++) {
        System.out.println("Hacer simulador # " + i);
        try{
            System.out.println("Toma un descanso de 10 milisegundos");
            Thread.sleep(10);
            }catch(InterruptedException e){
            e.printStackTrace();
            }
        
    }
}    
}
