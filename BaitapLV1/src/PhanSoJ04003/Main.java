/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PhanSoJ04003;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
    PhanSo ps = new  PhanSo(sc.nextLong(),sc.nextLong());
    ps.rutGon();
        System.out.println(ps);
    }
    
    
}
