/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author ahalya.l
 */
public class Child extends Parent{
    Child(){
        System.out.println("child cons");
    }
    public void c(){
        System.out.println("child");
        
    }
   static  public void c(Integer i) throws ArithmeticException{
        System.out.println("Integer".indexOf(null));
    }
//    private void c(int i) throws ArithmeticException{
//        System.out.println("int");
//    }
   
    public void c(String i) throws Exception{
        System.out.println("String");
    }
  
    public static void main(String[] args) {
        Child p=new Child();
        Parent p1=new Parent();
        p.c(1);
    }
    Map<String, List<String>> inventoryManagerCountMap = new HashMap<String, List<String>>();
    List l=new ArrayList();
}
