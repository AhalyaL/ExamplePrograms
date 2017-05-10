/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Multithreading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ahalya.l
 */
public class ExecuterPool {

    public static void main(String[] args) {
        ThreadPoolExecutor e=(ThreadPoolExecutor)Executors.newFixedThreadPool(5);
        Caller c=new  Caller();
        Future f=e.submit(c);
        try {
            System.out.println(f.get());
        } catch (InterruptedException ex) {
            Logger.getLogger(ExecuterPool.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ExecutionException ex) {
            Logger.getLogger(ExecuterPool.class.getName()).log(Level.SEVERE, null, ex);
        } e.shutdown();
    }
    
}
