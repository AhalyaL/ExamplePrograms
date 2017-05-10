/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.Scanner;

/**
 *
 * @author ahalya.l
 */
public class LeftRotationArray {
    


    public static int[] arrayLeftRotation(int[] a, int n, int k) {
        for(int i=0;i<k;i++){
           a= rotate(a);
        }
        
        return a;
      
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
      
        int[] output = new int[n];
        output = arrayLeftRotation(a, n, k);
        for(int i = 0; i < n; i++)
            System.out.print(output[i] + " ");
      
        System.out.println();
      
    }

    private static int[] rotate(int[] a) {
       int temp=a[0];int k=0;
       for(k=0;k<a.length-1;k++){
       a[k]=a[k+1];
       }
       a[k]=temp;
        return a;
        
    }
}

    

