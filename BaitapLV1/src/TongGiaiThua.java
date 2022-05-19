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
public class TongGiaiThua {
    private static long tinhGiaiThua(int n){
        long sum = 1;
        if(n < 2) return 1;
        
        for(int i = 2;i <= n ;i++)
        {
            sum *= i;
        }
        return sum;  
    }
    
    public static long tinhTongGt(int n){
        long sum = 0;
        for(int i = 1;i <= n;i++){
            sum += tinhGiaiThua(i);
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(tinhTongGt(n));
    }
}
