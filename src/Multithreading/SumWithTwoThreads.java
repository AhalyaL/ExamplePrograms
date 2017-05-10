/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Multithreading;

import java.util.Scanner;

/**
 *
 * @author ahalya.l
 */
public class SumWithTwoThreads {
   private static volatile int a, b,c,d;
    
    private static volatile int a1,a2;
   
    public static void main(String[] args) throws InterruptedException {
         Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        
        c = scanner.nextInt();
        d = scanner.nextInt();
      Runnable r1=new Runnable() {

             @Override
             public void run() {
             a1=a+b;
             }
         };
      Runnable r2=new Runnable() {

             @Override
             public void run() {
            a2=c+d;
             }
         };
      
        Thread t1=new Thread(r1);
        Thread t2=new Thread(r2);
        t1.start();t1.join();
        t2.start();t2.join();  System.out.println("sum"+a1*a2);
    }
}
