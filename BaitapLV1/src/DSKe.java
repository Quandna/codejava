import java.util.*;

public class DSKe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] Arr = new int[n+1][n+1];
        //nhap ma tran
        for(int i = 1;i <= n;i++){
            for(int j = 1;j<=n;j++){
                Arr[i][j] = sc.nextInt();
            }
        }
        // xu ly
        for(int i = 1;i <= n;i++){
            System.out.print("List("+i+") = ");
            for(int j = 1;j<=n;j++){
                if(Arr[i][j] == 1) {
                    System.out.print(j+" ");
                }
            }
            System.out.print("\n");
        }
    }
}
