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
public class lchonThamLam {
    
    public static void lchon(int n,int s){
        int[] a = new int[n];
        if(s == 0 || n*9<s){
            System.out.println("-1 -1");
        } else {
            int x = n-1;
            while(x > 0&& s>=9){
                s-=9;
                a[x]=9;
                x--;
            }
            a[x]=s;
            if(a[0]==0){
                a[0]=1;
                a[x]--;
            }
            for(int i = 0;i < n;i++){
                System.out.print(a[i]);
            }
                System.out.print(" ");
            for(int i = n-1;i>=0;i--){
                if(a[i]!=9){
                    a[i]++;
                    a[0]--;
                    break;
                }
            }
            for(int i = n-1;i>=0;i--){
                System.out.print(a[i]);
            }
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        lchon(n,s);
    }
}
