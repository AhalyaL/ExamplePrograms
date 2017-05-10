/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.io.IOException;

/**
 *
 * @author ahalya.l
 */
public class NewClass implements  intabs{

    @Override
    public  void g()  {
    String[] s=new String[1];
        System.out.println(s[1]);
    }
    public static void main(String[] args) {
        NewClass c=new NewClass();
        c.g();
    }
}
