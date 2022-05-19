import java.util.*;
public class SXClietkenguoc { // chua xanh
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int m = 0;
        int[][] b = new int[100][100];
        for(int i = 0 ;i < n;i++) {
            a[i] = sc.nextInt();
        }
        b[0][0] = a[0];
        for(int i = 1;i <=n-1;i++) {
            int t=a[i];
            int j = i-1;
            while(j>=0 && t<a[j]) {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = t;
            
            for(int h = 0; h <= m+1;h++) {
                b[m][h] = a[h];
            }
            m++;
        }
        for(int i = m-1; i >= 0;i--) {
            System.out.print("Buoc "+(i+1)+": ");
            for(int j = 0;j <= m;j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.print("\n");
            m--;
        }
        System.out.println("Buoc "+m+": "+b[0][0]);
        
    }
}
