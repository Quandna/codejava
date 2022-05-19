import java.util.*;
public class Main {
   
    public static int tongusnt(int  n)
    {
           int tong = 0;
           for(int i = 2;i <= n;i++ )
           {
               while(n%i==0)
               {
                   tong+=i;
                   n/=i;
               }
           }
           if(n>2) tong+=n;
           return tong;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0;i < n;i++)
            {
                a[i] = sc.nextInt();
            }
            int res = 0 ;
            for(int i = 0;i < n;i++)
            {
                res+=tongusnt(a[i]);
            }
            System.out.println(res);
    }
}
