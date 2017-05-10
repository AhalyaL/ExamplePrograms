/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author ahalya.l
 */
public class StaticNestedClass {
   private  void outerMethod() {
     System.out.println("inside outerMethod");
   }
    static int i=10;
   // A static inner class
     class Inner {
     public   void main(String[] args) {
        System.out.println("inside inner class Method"+i);
        outerMethod();
     }
      public void f(){
         
     }
   }
    public static void main(String[] args) {
        StaticNestedClass f =new StaticNestedClass();
       Inner d=f.new Inner();    }
}