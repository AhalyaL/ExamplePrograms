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
public class Threading implements Runnable{
    Printer p;int limit;int start;
Threading(Printer p,int limit,int start){
    this.p=p;this.limit=limit;this.start=start;
}
    @Override
    public void run() {
        int f=start;
        while(f<=limit){
            if(f%2==0){
                try {
                    p.printEven(f);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Threading.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                try {
                    p.printOdd(f);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Threading.class.getName()).log(Level.SEVERE, null, ex);
                }
            }f=f+2;
        }
            
    }
    
}
