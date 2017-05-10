/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticP;

/**
 *
 * @author ahalya.l
 */
public class Ex {
    static String v="d";
    {System.out.println("block");}
    static{
        System.out.println("staic block");
    }
    Ex(){
        System.out.println("object");
    }
    static public void f(){
        System.out.println("fff");
    }
  static  public void m(){
        System.out.println("methios"+v);  
    }
    public static void main(String[] args) {
        System.out.println("main 1");
      //  Ex x=new Ex();
         System.out.println("main 2");
       Ex x1=new Ex();
        v="f";
       f();
    }
    {
        System.out.println("block 2");m();
    }
    static {
        System.out.println("staic 2");
    }
}
