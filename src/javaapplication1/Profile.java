/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author ahalya.l
 */
public class Profile {
         private  Profile(int w) { // line 1
                  System.out.print(w);
         }
//         public static Profile() { // line 5
//                  System.out.print (10);
//         }
         public static void main(String args[]) {
                  Profile obj = new Profile(50);
         }
}
