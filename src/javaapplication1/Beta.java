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

class Beta  extends Thread {
	public static void main(String[] args) {
		Beta t = new Beta();
		Thread x = new Thread(t);
		x.start();
	}
//	public void run() {
//		for (int i = 0; i < 3; ++i) {
//			System.out.print(i + "..");
//		}
//	}
}

