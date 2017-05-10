/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clone.Emp;

/**
 *
 * @author ahalya.l
 */
public class Course implements Cloneable{
    
        private String courseName ;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

 protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
    
}
