/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bytedemo1;
import java.io.*;

/**
 *
 * @author HP ZBOOK 15U G2
 */
public class ByteDemo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
       FileWriter fr = new FileWriter("C:/javaprogram/FileDemo2.txt");
       
        String str = "Lear java Programming";
        
        fr.write(str);
       
    }
    
}
