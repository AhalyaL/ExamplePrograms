/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DS;

/**
 *
 * @author ahalya.l
 */
public class ArraySumtoZNearestNumb {
    
    
    public static void main(String[] args) {
        int n=50;
        Integer arr[]={1,4,7,9,34,76,99,547};
        sumOftwo(arr,n);
        
    }

    private static void sumOftwo(Integer[] arr, int n) {
        int resf=0,resl=0,sum=0;
        int f=0,l=arr.length-1,diff=Integer.MAX_VALUE;
         while(l>f){
             if(Math.abs(arr[f]+arr[l]-n) < diff){
                 diff=Math.abs(arr[f]+arr[l]-n);
                 sum=arr[f]+arr[l];
                 resf=f;resl=l;
             }
             if(arr[f]+arr[l]<n){
                 f++;
             }else{
                 l=l-1;
             }
             
         }
        System.out.println( diff + "   "+resf+"           "+resl+"            "+sum);
    }
}
