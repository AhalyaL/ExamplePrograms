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
 class outer {

    private int i = 10;

    private void call() {
        System.out.println("outer");
    }

    public static class inner  {
        public static void main(String[] args) {
            
        }
        private void call() {
           
            System.out.println("in" );
        }
    }

    public static void main(String[] args) {
        outer o = new outer();
        inner i = new inner();
        i.call();
        o.call();System.out.println(i);
    }

}
