/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */    import java.util.*;
public class LKtohop2 {
   public static int n,k,dem = 0;
   public static int[] a = new int[101];
   public static  boolean[] check = new boolean[100];
   public static void Init(){
       for(int i = 1;i<=k;i++)
           a[i] = i;
   }
   public static void Try(int i) {
        for(int j = a[i-1]+1; j<=n-k+i; j++) {
            if(check[j] == false) {
                a[i] = j;
                check[j] = true;
                if(i == k) {
                    dem++;
                    for(int l=1;l <=k;l++) {
                        System.out.print(a[l]);
                    }
                    System.out.print(" ");
                } else Try(i+1);
                check[j] = false;
            }
        }
    }
   
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        n =sc.nextInt();
        k = sc.nextInt();
        Init();
        Try(1);
        System.out.print("\n");
        System.out.print("Tong cong co "+dem+" to hop");
        
         
    }


}
