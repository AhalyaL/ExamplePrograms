/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ovveride;

import java.io.IOException;

/**
 *
 * @author ahalya.l
 */
public class A {
   static public void  a() {
            System.out.println("a");
    }
    public void  b() throws IOException{
            System.out.println("ba");
    }
    public void  b(int i, float j){
            System.out.println("b4");
    }
    public void  b(float i, int j){
            System.out.println("b2");
    }
     public void front(long a) {
        System.out.println("Radial Tire with long");
    }
     public void checkint(Integer a) {
        System.out.println("checkint A");
    }
     public void l(String a) {
        System.out.println("l A");
    }
}
