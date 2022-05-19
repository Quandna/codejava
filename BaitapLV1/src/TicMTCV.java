    import java.util.*;
public class TicMTCV {

    public static void Chuyenvimt(int n,int m,int[][] a,int[][] b,int[][] c)
    {
        for(int i = 0 ;i < n;i++)
            {
                for(int j = 0 ;j < m;j++)
                {
                    b[j][i] = a[i][j];
                }
            }
        for(int i = 0;i < n;i++)
        {
            for(int j = 0;j < n;j++)
            {
                for(int k = 0;k < m;k++)
                {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int test = 1;
        while(t > 0)
        {
            int n,m;
            n = sc.nextInt();
            m = sc.nextInt();
            int[][] a = new int[50][50];
            int[][] b = new int[50][50];
            int[][] c = new int[50][50];
            for(int i = 0 ;i < n;i++)
            {
                for(int j = 0 ;j < m;j++)
                {
                    a[i][j] = sc.nextInt();
                }
            }
            Chuyenvimt(n, m, a, b,c);
            System.out.println("Test "+test+":");test++;
            for(int i = 0 ;i < n;i++)
            {
                for(int j = 0;j < n;j++)
                {
                    System.out.print(c[i][j]+" ");
                }
                System.out.print("\n");
            }
            t--;
        }
        sc.close();
    }
}

