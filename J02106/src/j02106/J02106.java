/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j02106;
import java.util.*;
public class J02106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a [][] = new int[t][3];
        int kq = 0;
        for(int i = 0 ;i <t;i++){
            int dem1 = 0,dem0 = 0;
            for(int j = 0;j <3;j++){
                int x = sc.nextInt();
                if(x == 0) dem0++;
                else if(x == 1) dem1++;
            }
            if(dem1>dem0) kq++;
        }
        System.out.println(kq);
    }
    
}
