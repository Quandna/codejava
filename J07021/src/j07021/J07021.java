/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j07021;
import java.util.*;
import java.io.*;
public class J07021 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            if(s.equals("END")){
                break;
            }
            else{
                System.out.println(chuanHoa(s));
            }
        }
    }

    private static String chuanHoa(String s) {
        StringBuilder kq = new StringBuilder();
        StringTokenizer tk = new StringTokenizer(s);
        while(tk.hasMoreTokens()){
            String tmp = tk.nextToken();
            kq.append(Character.toUpperCase(tmp.charAt(0)));
            for(int i = 1;i<tmp.length();i++){
                kq.append(Character.toLowerCase(tmp.charAt(i)));
            }
            kq.append(" ");
        }
        return kq.toString().trim();
    }
    
}
