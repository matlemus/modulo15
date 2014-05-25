/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package comunicacion;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SISTEMAS
 */
public class SyncStack {
    private List<Character> buffer = new ArrayList<Character>(400);
    public synchronized char pop(){
        char c;
        while(buffer.size() ==0){
            try {
                this.wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(SyncStack.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        c = buffer.remove(buffer.size()-1);
        return c;
    }
    public synchronized void push(char c){
        this.notify();
        buffer.add(c);
        
    }    
}
