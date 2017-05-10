/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ahalya.l
 */
public class JoinAndIsAlive extends Thread{

    @Override
    public void run() {
        f();
        System.out.println("t1"+Thread.currentThread());
    }
    
    public static void main(String[] args) {
        JoinAndIsAlive t1=new JoinAndIsAlive();
        JoinAndIsAlive t2=new JoinAndIsAlive();
        t1.start();
        t2.start();
        try {
            t1.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(JoinAndIsAlive.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("t2");
    }

    private void f() {
        System.out.println("t3");
    }
}
