/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Innerclassses;

/**
 *
 * @author ahalya.l
 */
public class Innerclass {
    private String c="s";
    public String c1="s";
    public void g(){
        System.out.println("out"); 
    }
    public static void main(String[] args) {
        
    }
    public  class StaticInner{
        public String s=c;
        
       StaticInner(){
//           Innerclass.this.g();
           System.out.println(c+"==============="+c1);
       }
        public void g(){
        System.out.println("in"); 
    }
    }
    
}
