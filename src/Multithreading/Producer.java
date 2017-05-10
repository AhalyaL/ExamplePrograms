/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Multithreading;

import java.util.concurrent.BlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ahalya.l
 */
public class Producer implements Runnable{
  BlockingQueue<String> bQueue ;
    Producer(BlockingQueue<String> bQueue){
        this.bQueue=bQueue;
    }
 
    @Override
    public void run() {
for(int i=0;i<10;i++){
    try {
        if(bQueue.size()==5){
            synchronized(this){
                 wait();
            notifyAll();
            }
           
        }
        bQueue.put(""+i);System.out.println(i);
    } catch (InterruptedException ex) {
        Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
    }
}
    }
    
}
