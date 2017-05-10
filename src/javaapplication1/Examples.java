/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author ahalya.l
 */
public class Examples {
    public static void main(String[] args) {
        String number = "10";
int result = Integer.parseInt(number);
System.out.println(result);

HashMap<Integer,String> mp= new HashMap();
mp.put(1,"one");
mp.put(2,"2");
mp.put(3,"3");
mp.put(4,null);
mp.put(null,null);
 for(Map.Entry<Integer,String> e:mp.entrySet()){
     System.out.println("==========>"+e.getKey()+"=============>"+e.getValue());
   
 }
 mp.forEach(
         (k,v)->
         {System.out.println(k);
                 }
                 );
 ///////////////////////////////////////////////////////////
 List<String> items = new ArrayList<>();
items.add("A");
items.add("B");
items.add("C");
items.add("D");
items.add("E");

items.forEach(item->System.out.println(item));
items.stream().filter(s->s.contains("B")).
        forEach(item->System.out.println(item));



Object o=new Object();






    }
    
  
}
