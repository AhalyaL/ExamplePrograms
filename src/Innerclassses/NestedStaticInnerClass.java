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
public class NestedStaticInnerClass {
    public int i=0;
    
    public static class StaticInner{
        public void get(){
            System.out.println("hiiii");
        }
        public static void main(String[] args) {
            StaticInner s=new StaticInner();
            s.get();
        }
    }
    public static void main(String[] args) {
         StaticInner.main(args);
    }
}
