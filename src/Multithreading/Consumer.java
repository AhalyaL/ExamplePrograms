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
public class Consumer implements Runnable{
    BlockingQueue<String> bQueue ;
    Consumer(BlockingQueue<String> bQueue){
        this.bQueue=bQueue;
    }
 
    @Override
    public void run() {
      while(!bQueue.isEmpty()){
          try {
               if(bQueue.size()<5){
           synchronized(this){
                 wait();
            notifyAll();
            }
        }
              System.out.println("consumed--->"+bQueue.take());
          } catch (InterruptedException ex) {
              Logger.getLogger(Consumer.class.getName()).log(Level.SEVERE, null, ex);
          }
      }
    
    }
    
}
