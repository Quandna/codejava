
package j01022;
import java.util.*;
/**
 *
 * @author ADMIN
 */
public class J01022 {
    static long fibo [] = new long[93];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        fibo[1] = 1;
        fibo[2] = 1;
        for(int i = 3;i<93;i++){
            fibo[i] = fibo[i-2]+fibo[i-1];
            
        }
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            long k = sc.nextLong();
            System.out.println(find(n,k));
        }
    }
    
    private static long find(long n,long k){
        if(n==1) return 0;
        else if(n == 2) return 1;
        else {
            if(k <= fibo[(int)(n-2)]) return find(n-2,k);
            else return find(n-1,k-fibo[(int)(n-2)]);
        }
    }
    
}
