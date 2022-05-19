import java.util.*;
public class TinhLuyThua {
    public static long o = 1000000007;
    public static long mu (long x) {
        return (x*x)%o;
    }
    
    public static long pow(long a, long b) {
        if(b == 0) return 1%o;
        else {
            if(b % 2 == 0) return mu(pow(a , b/2))%o;
            else return a*(mu(pow(a,b/2)%o))%o;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 25;
         long m,n;
        while(t-->0){
            m = sc.nextLong();
            n = sc.nextLong();
            if(m == 0 && n == 0){
                break;
            }
            else{
                System.out.println(pow(m,n));
            }
        }//while
    }
}
