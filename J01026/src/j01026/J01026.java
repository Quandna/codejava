package j01026;
import java.util.*;
/**
 *
 * @author ADMIN
 */
public class J01026 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long a = sc.nextLong();
            long b = (long) Math.sqrt(a);
            if(Math.pow(b, 2) == a) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    
}
