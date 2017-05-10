/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Permutation;

/**
 *
 * @author ahalya.l
 */
public class permString {
    public static void main(String[] args) {
        String s= "123";
        checkPerm("",s);
    }

    private static void checkPerm(String c, String s) {
     if(s.equals("")){
         System.out.println(c+s);
        
    }
     for(int i=0;i<s.length();i++){
         
     checkPerm(c+s.charAt(i),s.substring(0, i)+s.substring(i+1, s.length()));}
     
    }
}
