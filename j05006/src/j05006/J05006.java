/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j05006;
import java.text.ParseException;
import java.util.*;
public class J05006 {

    public static void main(String[] args) throws ParseException {
        ArrayList<SinhVien> s = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        for(int i = 1;i<=n;i++){
            SinhVien p = new SinhVien(i,in.nextLine(),in.nextLine(),in.nextLine(),in.nextLine(),in.nextLine(),in.nextLine());
            s.add(p);
            
        }
        for(SinhVien i : s){
            System.out.println(i);
        }
    }
    
}
