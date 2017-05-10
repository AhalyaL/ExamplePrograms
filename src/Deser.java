
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ahalya.l
 */
public class Deser {
    public static void main(String[] args) {
        
        ObjectInputStream outStream = null;
        try {
            Serialization emp = new Serialization();
            FileInputStream fileOut = new FileInputStream("C:\\Users\\ahalya.l\\Desktop\\New folder\\E.txt");
                   
            outStream = new ObjectInputStream(fileOut);
            try {
               emp=(Serialization) outStream.readObject();
              //  System.out.println("--->"+emp.s);
                System.out.println("--->"+emp.s1);
              //  System.out.println("--->"+emp.s2);
                System.out.println("--->"+emp.s3);
              //  System.out.println("--->"+emp.i);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Deser.class.getName()).log(Level.SEVERE, null, ex);
            }
            outStream.close();
            fileOut.close();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                outStream.close();
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

  
    }
}
