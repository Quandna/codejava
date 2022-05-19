/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.*;
import java.util.StringTokenizer;

/**
 *
 * @author Admin
 */
public class SV1 {
   private String ma,name,lop,mail;

    public SV1(String ma, String name, String lop, String mail) {
        this.ma = ma;
        this.name = chuanhoa(name);
        this.lop =lop;
        this.mail = mail;
    }

    SV1(String a, String b, String c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   @Override
    public String toString(){
        return ma+" "+name+" "+lop+" "+mail;
    }
   private String chuanhoa(String s){
        StringBuilder a = new StringBuilder();
            StringTokenizer b = new StringTokenizer(s);
            while(b.hasMoreTokens()){
                String word=b.nextToken();
                a.append(Character.toUpperCase(word.charAt(0)));
                for(int i=1;i<word.length();i++){
                    a.append(Character.toLowerCase(word.charAt(i)));
               }
                a.append(" ");
            } 
            return a.toString();
   }
}
