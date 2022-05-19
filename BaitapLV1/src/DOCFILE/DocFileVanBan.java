
package DOCFILE;

import java.util.*;
import java.io.*;
public class DocFileVanBan {
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner in = new Scanner(new File("DATA.in"));
        while(in.hasNextLine()){
            String data = in.nextLine();
            System.out.println(data);
        }
//        in.close();
    }

 
}
