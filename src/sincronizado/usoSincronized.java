/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sincronizado;

/**
 *
 * @author SISTEMAS
 */
public class usoSincronized {
    public static void main(String[] args) {
       HelloRunner r = new HelloRunner();
       Thread t = new Thread(r,"Soldier");
       Thread t1 = new Thread(r,"Tenient");
       t.start();
       t1.start();

    }
}

class HelloRunner implements Runnable{
int i=0;
    @Override
    public void run() {
        synchronized(this){
        String name = Thread.currentThread().getName();
        
        for (; i < 50; i++) {
            System.out.println(name +" : "+ i);
           
        }
      }
    }
}
