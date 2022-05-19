package j03039;
import java.util.*;
import java.math.*;
/**
 *
 * @author ADMIN
 */
public class J03039 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            BigInteger c= new BigInteger("0");
            if(a.mod(b).equals(c) ) System.out.println("YES");
            else if (b.mod(a).equals(c) ) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    
}
