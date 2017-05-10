/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author ahalya.l
 */
public class NewClass {
// class DisplayOverloading

    public void disp(int c)
    {
         System.out.println("h"+c);
    }
    public void disp(double c)  
    {
         System.out.println(c );
         
    }
}
class Sample
{
   public static void main(String args[])
   {
       NewClass obj = new NewClass();
       obj.disp(10.78);
     
   }
}
    

