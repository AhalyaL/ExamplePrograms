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
public class Bottom2 extends Thread {
	private int x = 2;
	public static void main(String[] args) throws Exception {
		new Bottom2().makeItSo();
	}
	public Bottom2() {
		x = 5;
		start();
	}
	public void makeItSo() throws Exception {
		join();
		x = x - 1;
		System.out.println(x);
	}
	public void run() {
		x *= 2;
	}
}