/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author ahalya.l
 */
public class FileOutputStre {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File f=new File("D:\\a.txt");
        FileOutputStream fop=new FileOutputStream(f);
        String content = "This is the text content";
        byte[] contentInBytes = content.getBytes();

			fop.write(contentInBytes);
			fop.flush();
			fop.close();

			System.out.println("Done");
    }
}
