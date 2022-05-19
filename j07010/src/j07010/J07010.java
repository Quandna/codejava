/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j07010;

import java.io.*;
import java.util.*;
import java.text.*;
public class J07010 {

    public static void main(String[] args) throws IOException,FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("SV.in"));
        ArrayList<SinhVien> s = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        
        int n = 0;
        while(t-->0){
            n++;
            String a = sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            Float d = Float.parseFloat(sc.nextLine());
            
            SinhVien p  = new SinhVien(n,a,b,c,d);
            
            s.add(p);
        }
        for(SinhVien i : s){
            System.out.println(i);
        }
    }
    
}
