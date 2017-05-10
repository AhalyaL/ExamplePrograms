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
public class Emp implements Cloneable{
    private String name;
  private Course course;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
      protected Object clone() throws CloneNotSupportedException
    {
        Emp e=(Emp)super.clone();
       e.course = (Course) course.clone();
        return e;
    }
      public static void main(String[] args) throws CloneNotSupportedException {
        Emp e=new Emp();
        e.setName("a");
        Course c=new Course();
        c.setCourseName("c1");
        e.setCourse(c);
        Emp e1=(Emp)e.clone();
          
          e1.getCourse().setCourseName("sadd");
              System.out.println("---------"+e.getName());
          System.out.println("---------"+e.getCourse().getCourseName());
          System.out.println("---------"+e1.getName());
          System.out.println("---------"+e1.getCourse().getCourseName());
    }
    
}
