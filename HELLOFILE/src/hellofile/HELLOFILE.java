
package hellofile;
import java.util.*;
import java.io.*;
public class HELLOFILE {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("Hello.txt"));
        while(in.hasNextLine()){
            String data = in.nextLine();
            System.out.println(data);
        }
    }
    
}
