/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

import java.util.HashSet;

/**
 *
 * @author ahalya.l
 */
public class A {
     protected void c(){
        System.out.println("in A");
      
    }
     public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, CloneNotSupportedException {
      
        A a=(A)Class.forName("polymorphism.A").newInstance();
        
        a.c();
        A s=(A)a.clone();s.c();
        
    }
}
