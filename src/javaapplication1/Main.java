/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ahalya.l
 */
public class Main {
    
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String s;
    while ((s = in.readLine()) != null) {
      System.out.println(s);
      if(!"".equals(s)){
         String[] arr= s.split(",");
     checkSuffix(arr[0],arr[1],arr[0].length()-1); 
      }
      
    }
  }

    private static void checkSuffix(String one,String two,int i) {
   
    if(one.charAt(i)==two.charAt(i)){
        i=i-1;
        checkSuffix(one, two, i);
    }else{
        if("".equals(one.substring(i+1))){
            System.out.println("NULL");
        }
        else{
            System.out.println(one.substring(i+1));
        }
    }
    }
}
