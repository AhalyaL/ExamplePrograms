/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Innerclassses;

/**
 *
 * @author ahalya.l
 */
public class Anony {
   static ProgrammerInterview pInstance = new    ProgrammerInterview() {
  public void read() {
   System.out.println("anonymous ProgrammerInterview");
  }
 };
    public static void main(String[] args) {
        pInstance.read();
        pInstance.read1();
        new    Interf() {
  public void read() {
   System.out.println("anonymous ProgrammerInterview");
  }

            @Override
            public void read1() {
            }
 };
    }
}
