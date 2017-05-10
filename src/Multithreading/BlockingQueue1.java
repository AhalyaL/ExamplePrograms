/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Multithreading;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 *
 * @author ahalya.l
 */
public class BlockingQueue1 {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> bQueue = new LinkedBlockingQueue<String>(5);
        
Thread t1=new Thread(new Producer(bQueue));
Thread t2=new Thread(new Consumer(bQueue));
t1.start();

//t1.join();
t2.start();
//t2.join();
        System.out.println("hiiiiiiii");
    }
}
