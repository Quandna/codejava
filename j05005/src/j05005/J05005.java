/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j05005;
import java.util.*;
import java.text.*;
public class J05005 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> ds = new ArrayList<>();
        for(int i = 1;i<=n;i++){
        SinhVien p = new SinhVien(i,sc.nextLine(),sc.nextLine(),sc.nextLine(),Float.parseFloat(sc.nextLine()));
        ds.add(p);
        }
        Collections.sort(ds);
        for(SinhVien i:ds){
            System.out.println(i);
        }
    }
    
}
