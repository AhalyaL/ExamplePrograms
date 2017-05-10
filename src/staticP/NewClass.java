/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticP;

/**
 *
 * @author ahalya.l
 */
public class NewClass {
    private static int i=0;
    public static void main(String[] args) {
        System.out.println(NewClass.i);
        NewClass n=new NewClass();
        System.out.println(n.i);
    }
}
