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
public abstract class AnonymousClass {

  abstract  void show();
  void s(){
      
  }
    
    
}
class Flavor1Demo {
 
   //  An anonymous class with Demo as base class
   static  AnonymousClass d = new AnonymousClass() {
       void s() {
          
           System.out.println("i am in Flavor1Demo class");
       }

       @Override
       void show() {
       }
   };
   public static void main(String[] args){
       d.show();
   }
}