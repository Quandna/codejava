import java.util.*;

public class Sxchen {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0 ;i < n;i++)
            {
                a[i] =  sc.nextInt();
            }
            int x = 0;
            System.out.println("Buoc "+x+": "+a[0]);
           
            for(int i = 1;i <= n-1;i++)
            {
                int  t = a[i];
                int j = i-1;
                while(j>=0 && t<a[j])
                {
                    a[j+1] = a[j];
                    j--;
                }
                a[j+1] = t;
                System.out.print("Buoc "+(x+1)+": ");
                
                for(int b = 0; b <=x+1;b++){
                    System.out.print(a[b]+" ");
                }
                
                System.out.print("\n");
                x++;
            }
        }
    }
}
