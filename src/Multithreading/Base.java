/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Multithreading;

/**
 *
 * @author ahalya.l
 */
public class Base {
    public static void main(String[] args) {
        Printer p=new Printer();
        Threading a=new Threading(p,10,1);
        Threading b=new Threading(p,10,2);
        Thread even=new Thread(a);
        Thread odd=new Thread(b);
        even.start();odd.start();
    }
}
