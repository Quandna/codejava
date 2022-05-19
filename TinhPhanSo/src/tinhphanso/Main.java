/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tinhphanso;

/**
 *
 * @author ADMIN
 */
import java.util.*;
public class Main {
       public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            phanSo A = new phanSo(in.nextLong(),in.nextLong());
            phanSo B = new phanSo(in.nextLong(),in.nextLong());
            phanSo C=A.Tong(B);
        phanSo D=A.Tich(B, C);
        System.out.print(C+" " );
        System.out.println(D);
        }
    }
}
