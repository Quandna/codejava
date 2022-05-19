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

public class quayPhai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int[] a = new int[n];            
            for(int i = 0;i < n;i++){
                a[i] = sc.nextInt();
            }
            int[] b = Arrays.copyOf(a, a.length);
            Arrays.parallelSort(b);    
            if(Arrays.equals(a, b) == true){
                System.out.println("0");
            }else {
                int dem = 0;
                while(Arrays.equals(a,b) == false){
                    int luu = a[0];
                    
                    for(int i = 0;i < n-1;i++){
                             a[i]=a[i+1];
                    } 
                    a[n-1] = luu;
                    dem++;
                }
                System.out.println(dem);
            }
            
        }
    }
}
