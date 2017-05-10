/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Errors;

/**
 *
 * @author ahalya.l
 */
public class Finally {
    public static void main(String[] args) {
      int i= sa();
        System.out.println(i);
    }

    private  static int sa() {
 try{
     return 0;
            
        }catch(Exception e){
            e.printStackTrace();
             return 0;
        }finally{
     return 1;
 }
       
    }
}
