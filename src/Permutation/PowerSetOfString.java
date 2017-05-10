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
public class PowerSetOfString {
      String str="abcd";
    public static void main(String[] args) {
      PowerSetOfString p=new PowerSetOfString();
      
        for(int i=0;i<p.str.length();i++){
           p.parse("",i);
        }
    }

    private  void parse(String s, int i) {
String b=""+str.charAt(i);
        System.out.println(s+b);
        for(int j=i+1;j<str.length();j++){
            parse(s+b,j);
        }
    }
    
    
}
