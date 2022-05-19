/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j07002;

import java.util.*;
import java.io.*;
import java.text.*;
public class J07002 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        long tong = 0;
        while(sc.hasNext()){
            try{
                int x = Integer.parseInt(sc.next());
                tong+=x;
            }
            catch(Exception e){}
        }
        System.out.println(tong);
    }
    
}
