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

class Square extends Rectangle{
      public int area(long length, long width){
          System.out.println("here");
            return  (int) Math.pow(length, 2);
      }
}

