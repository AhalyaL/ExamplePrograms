/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Multithreading;

/**
 *
 * @author ahalya.l
 */
public class Interept extends Thread{  
public void run(){  
for(int i=1;i<=2;i++){  
if(Thread.interrupted()){  
System.out.println("code for interrupted thread");  
}  
else{  
System.out.println("code for normal thread");  
}  
  
}//end of for loop  
}  
  
public static void main(String args[]){  
Interept t1=new Interept();  
Interept t2=new Interept();  
t1.start();  
try{  
t1.interrupt();  
}catch(Exception e){System.out.println("Exception handled "+e);}  
 // t2.start();
 // t1.start();
}  
}  
