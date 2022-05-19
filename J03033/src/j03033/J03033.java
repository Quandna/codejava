package j03033;
import java.util.*;
import java.math.*;
/**
 *
 * @author ADMIN
 */
public class J03033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            BigInteger x = a.gcd(b);
            BigInteger y = (a.multiply(b)).divide(x);
            System.out.println(y);
        }
    }
    
}
