/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

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
      if(!"".equals(s)){
     check(s); 
      }
      
    }
  }

    private static void check(String one) {
   StringBuilder b=new StringBuilder();
//   b.append(one.charAt(0));
   for(int i=0;i<one.length()-1;i++){
       if(!"0".equals(String.valueOf(one.charAt(i))) && !"0".equals(String.valueOf(one.charAt(i+1)))){
          if(Character.getNumericValue(one.charAt(i))%2==0 && Character.getNumericValue(one.charAt(i+1))%2==0){
           b.append(one.charAt(i)).append('*');
       }
       else if(Character.getNumericValue(one.charAt(i))%2==1 && Character.getNumericValue(one.charAt(i+1))%2==1){
            b.append(one.charAt(i)).append('-');
       }
           else{
            b.append(one.charAt(i));
       }
       }
       else{
            b.append(one.charAt(i));
       }
       
   }
     b.append(one.charAt(one.length()-1));   
        System.out.println(b.toString());
    }
}

