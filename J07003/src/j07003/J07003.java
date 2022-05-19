/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j07003;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.math.*;
public class J07003 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        String s="";
        while(sc.hasNextLine()){
            s += sc.nextLine();
        }
        while(s.length() > 1){
            int x = s.length()/2;
            BigInteger a = new BigInteger(s.substring(0,x));
            BigInteger b = new BigInteger(s.substring(x,s.length()));
            BigInteger tong = a.add(b);
            s = tong.toString();
            System.out.println(tong);
        }
    }
    
}
