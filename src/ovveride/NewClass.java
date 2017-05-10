/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ovveride;

/**
 *
 * @author ahalya.l
 */
public class NewClass {

  public static void main (String[] args)
  {
      NewClass n=new NewClass();
    int l = 5;
    n.aMethod(Integer.valueOf(l));
  }
 
 
   void aMethod (Object  x)
  {
    System.out.println("long version: " + (Long)x);
  }
   static void aMethod (Long  x)
  {
    System.out.println("long version: " + (Long)x);
  }

}
