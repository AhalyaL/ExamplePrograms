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
public class LLL {
    Node tail=null;
    Node head=null;
    class Node{
        int i;
        Node next;
        Node(int i){
        this.i=i;
        next=null;
            
        }
       
    }
     public void reverse(int k,Node n){
         int c=0;
         Node current=n;
         while(c<k && current!=null){
            // current
             
         }
        }
        public void push(int i){
            Node n=new Node(i);
            if(tail!=null){
              tail.next=n; 
            }else{
                tail=n;
                head=n;
            }
            
        }
        public void print(){
            Node n=head;
           while(n!=null){
               System.out.println(n.i);n=n.next;
           }
        }
        public static void main(String[] args) {
        LLL l=new LLL();
        for(int i=0;i<10;i++){
               l.push(i);
        }
     l.print();
     l.reverse(3,l.head);
     l.print();
        
    }
}
