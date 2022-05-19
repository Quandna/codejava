/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j05041;

import java.util.*;

public class J05041 {
public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int t = Integer.parseInt(sc.nextLine());
       ArrayList<TinhCong05041> ds = new ArrayList<>();
       for(int i =1 ;i<=t ;i++){
           TinhCong05041 p = new TinhCong05041(i,sc.nextLine(),Long.parseLong(sc.nextLine()),Integer.parseInt(sc.nextLine()),sc.nextLine());
           ds.add(p);
       }
       Collections.sort(ds);
       
       for(TinhCong05041 i:ds){
           System.out.println(i);
       }
    }
    
}
