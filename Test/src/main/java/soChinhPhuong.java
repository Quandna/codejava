/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
import java.util.*;
public class soChinhPhuong {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        int t = nhap.nextInt();
        while(t-- >0){
            int n;
            n = nhap.nextInt();
            int x = (int) Math.sqrt(n);
            if(x*x == n){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            
    }  
  }
    
}
