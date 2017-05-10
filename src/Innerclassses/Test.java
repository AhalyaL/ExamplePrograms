/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Innerclassses;

import Innerclassses.Innerclass.StaticInner;

/**
 *
 * @author ahalya.l
 */
public class Test {
    public static void main(String[] args) {
        Innerclass n=new Innerclass();
        StaticInner i=n.new StaticInner();
        System.out.println(i.s);
        i.g();
        
        NestedStaticInnerClass.StaticInner s=new NestedStaticInnerClass.StaticInner();
        s.get();
        NestedStaticInnerClass.StaticInner.main(args);
        
    }
}
