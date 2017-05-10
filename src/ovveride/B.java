/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ovveride;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ahalya.l
 */
public class B extends A{
 
   static public void  a() throws ClassCastException{
            System.out.println("a1");
    }
    public void  b() throws IOException{
            System.out.println("b1");
    }
     public void front(int a) {
        System.out.println("b vvv");
    }
       //  @Override
        public void checkint(int a) {
        System.out.println("checkint B");
    }
        public void l(Long a) {
        System.out.println("l");
    }
        public void l(Integer a) {
        System.out.println("i");
    }
    public static void main(String[] args) {
       // a();
        A a=new B();
        B b=new B();
       try {
          // a.b();
           int f=10; a.a();b.a();
           //a.l(f);
         // a.front(Integer.valueOf(10));
          // a.checkint(Integer.valueOf(10));
       } catch (Exception ex) {
           Logger.getLogger(B.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
}
