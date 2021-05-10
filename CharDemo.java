
import java.io.*;

public class CharDemo {

    
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
  /*      char c[] = {'a','b','c','d','e','f','g','h','i','j'};
        CharArrayReader cr = new CharArrayReader(c);
        int x;
        while((x=cr.read())!=-1)
        {
            System.out.print((char)x);
        }   */
        FileWriter wr = new FileWriter("C:/javaprogram/xy.txt");
        CharArrayWriter cw = new CharArrayWriter(20);
        cw.write('1');
        cw.write('2');
        cw.write('a');
        cw.write('b');
        cw.writeTo(wr);
        
        String str=cw.toString();
        System.out.print(str);
        /*char c[]=cw.toCharArray();
        for(char x:c)
            System.out.print(x);*/
        
    }
    
}
