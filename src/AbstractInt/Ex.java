/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractInt;

/**
 *
 * @author ahalya.l
 */
public class Ex extends Impl{

    @Override
    public void c() {i=i+1;System.out.println(i);
    }

    @Override
    public void k() {
    }

    @Override
    public void f() {
    }
    @Override
    public void p() {
    }
    public static void main(String[] args) {
        Ex c=new Ex();c.c();
        impl2 i=new impl2();i.c();
    }
}
