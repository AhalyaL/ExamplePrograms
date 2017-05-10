/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hashcode;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author ahalya.l
 */
public class NewClass {
    public static void main(String[] args) {
        try {
                //
//        List l=new ArrayList();l.add("s");
//        System.out.println(l.toString());
//        l.clear(); System.out.println(l.toString());
//        String[] s=new String[2];
//        s[0]="a";
//        System.out.println(s.toString());
//        Comparator comparator = Collections.reverseOrder();
//        TreeMap m=new TreeMap();
                // Emp p=new Emp();
//                Emp emp2 = (Emp) Class.forName("Hashcode.Emp")
//                        .newInstance();
//                
//                Constructor<Emp> constructor = null;
//                    constructor = Emp.class.getConstructor();
//               
//                    Emp emp3 = constructor.newInstance();
                   Emp emp4 = (Emp) Emp.getSal().clone();
                } catch (Exception ex) {
ex.printStackTrace();                } 
        
//        m.put(p, l);
        List vector=new ArrayList();
 vector.add("indhu");
 vector.add("sindhu");
 vector.add("swathi");
 vector.add("swathi");
 vector.add(null);
 vector.add(null);
 
 Iterator i=vector.iterator();
 int k=0;
 while(i.hasNext()){
     k++;
     if(k==2){
         System.out.println("hi");
        i.remove();
        vector.remove("indhu");
     }
     System.out.println(i.next());
     
 }
 
 System.out.println(vector.size());
    }
}
