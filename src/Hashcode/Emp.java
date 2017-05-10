/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hashcode;

/**
 *
 * @author ahalya.l
 */
public class Emp implements Cloneable{
    int id;
    int name;
    int sal;
private Emp(){
    
}
public Object clone()throws CloneNotSupportedException{  
return super.clone();  
}  
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public static Emp getSal() {
        Emp p=new Emp();
        return p;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }
    
}
