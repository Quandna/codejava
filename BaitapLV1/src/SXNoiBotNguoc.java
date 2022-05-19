import java.util.*;
public class SXNoiBotNguoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            int[][] c = new int[100][100];
            for(int i = 0 ;i < n;i++) {
                a[i] = sc.nextInt();
               // b[i] = a[i];
            }
            //Arrays.sort(b);
            int m = 1;
            for(int i = 0;i < n-1;i++){
                int d = 0;
                
                for(int j =0;j < n-i-1;j++){
                    if(a[j] > a[j+1]){
                        int tmp = a[j];
                            a[j] = a[j+1];
                            a[j+1] = tmp;
                            d=1;    
                    } 
                }
                
                if(d==1) {
                         for(int h = 0;h < n;h++) c[m][h] = a[h];
                            m++;    
                    }
                else break;    
            }
            for(int k = m-1;k >=1;k--){
                System.out.print("Buoc "+k+": ");
                for(int i = 0;i < n;i++){
                    System.out.print(c[k][i]+" ");
                }
                System.out.println("");
            }
            
        }
    }
}
