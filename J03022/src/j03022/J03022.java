/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j03022;
import java.util.*;
import java.io.*;
/**
 *
 * @author ADMIN
 */
public class J03022 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "";
        while(sc.hasNext()){
            str += sc.nextLine();
        }
        String r ="[.?!]+";
        String arr [] = str.split(r);
        
        for(String s:arr){
            s = s.trim().toLowerCase();
            StringBuilder sb = new StringBuilder();
            StringTokenizer st = new StringTokenizer(s);
            while(st.hasMoreTokens()){
                sb.append(st.nextToken(" ")+" ");
            }    
                sb.deleteCharAt(sb.length()-1);
                sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
                System.out.println(sb.toString().trim());
            
        }
    }
    
}
