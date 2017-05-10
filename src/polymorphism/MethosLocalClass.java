/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author ahalya.l
 */
public class MethosLocalClass {
    
static void outerMethod() {
	final int x=98;
	System.out.println("inside outerMethod");
	 class Inner {
            
		 void innerMethod() {
			System.out.println("x = "+x);
		}
	}
	Inner y = new Inner();
	y.innerMethod();
}
void innerMethod() {outerMethod();
			System.out.println("x = ");
		}
}
class MethodLocalVariableDemo {
	public static void main(String[] args){
	MethosLocalClass x = new MethosLocalClass();
	x.outerMethod();
        
	}

}
