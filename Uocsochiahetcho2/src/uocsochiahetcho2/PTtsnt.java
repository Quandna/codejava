import java.util.*;
public class PTtsnt {
    public static boolean checknt(Long n){
        if(n < 2) return false;
        for(int i = 2;i <= Math.sqrt(n);i++)
        {
            if(n%i==0) return false;
        }
        return true;
        
        
    }
    public static void ptsnt(Long n)
    {
        int dem = 0;
        for(Long i = 2L;i <= n;i++)
        {
            dem = 0;
            while(checknt(i)==true &&(n%i==0))
            {
                dem++;
                n/=i;
            } 
            if(dem > 0)
            System.out.print(i+"("+dem+") ");
           
        }
        if(n > 2) System.out.print(n+"(1) ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int i = 1;
        while(t > 0)
        {
            Long n;
            n=sc.nextLong();
            System.out.print("Test "+i+": ");i++;
            ptsnt(n);
            System.out.print("\n");
            t--;
        }
    }
}
