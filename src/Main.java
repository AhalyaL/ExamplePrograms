/**
 *
 * NOTE : Class Name should be Main 
 *
 **/
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
class Main {
    public static void main(String[] args)  {
      
        ObjectOutputStream outStream = null;
        try {
            Serialization emp = new Serialization();
            FileOutputStream fileOut = new FileOutputStream("C:\\Users\\ahalya.l\\Desktop\\New folder\\E.txt");
                   
            outStream = new ObjectOutputStream(fileOut);
            outStream.writeObject(emp);
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