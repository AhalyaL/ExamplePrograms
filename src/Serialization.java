
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ahalya.l
 */
public class Serialization implements Serializable{
   static final long serialVersionUID = 1L;
    public Serialization() {
    }
    
  //  public int i=10;
   // public String s="www";
    public static String s1="www1";
    private String s2="www2";
    public transient String s3="www3";
    
}
