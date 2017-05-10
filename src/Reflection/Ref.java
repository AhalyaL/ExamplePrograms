/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ahalya.l
 */
public class Ref {
    public static void main(String[] args) throws SecurityException, NoSuchMethodException {
        pojo p=new pojo();
        
     Method m=   p.getClass().getMethod("getOne");
        try {
            int[] s=new int[7];s[1]=4;
            List l=new ArrayList();l.add("a");
            
            System.out.println(l);
            System.out.println(s.toString().indexOf('4'));
            Field f= p.getClass().getField("one");
            try {
                System.out.println(f.get(p));
            } catch (IllegalArgumentException ex) {
                Logger.getLogger(Ref.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(Ref.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (NoSuchFieldException ex) {
            Logger.getLogger(Ref.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
           String s=(String) m.invoke(p, null);System.out.println(s);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Ref.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(Ref.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvocationTargetException ex) {
            Logger.getLogger(Ref.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
