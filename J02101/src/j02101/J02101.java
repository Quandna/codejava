/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j02101;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class J02101 {
    public static void main(String[] args) {
        Scanner  in = new Scanner(System.in);
        int t= in.nextInt();
        while (t-- >0){
            int n=in.nextInt();
            int[][] a=new int[n+5][n+5];
            for(int i=1; i<=n; i++){
                for(int j=1; j<=n; j++){
                    a[i][j]=in.nextInt();
                }
            }
            for(int i=1; i<=n; i++){
                if(i%2==1){
                    for(int j=1; j<=n; j++){
                        System.out.print(a[i][j]+" ");
                    }
                }
                else {
                    for(int j=n; j>=1; j--){
                        System.out.print(a[i][j]+" ");
                    }
                }
            }
            System.out.println();
        }
    }


    
}
