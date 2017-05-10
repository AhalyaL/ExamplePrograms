/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Multithreading;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author ahalya.l
 */
public class Printer {
    boolean even=true;
  synchronized public void printEven(int i) throws InterruptedException{
      if(even){
          wait();
      }
          System.out.println("even"+i);
     
      even=true;
        notifyAll();
    }
  synchronized public void printOdd(int i) throws InterruptedException{
      if(!even){
          wait();
      }
          System.out.println("odd"+i);
//      List l=new LinkedList();
      even=false;
        notifyAll();
    }
    
}
