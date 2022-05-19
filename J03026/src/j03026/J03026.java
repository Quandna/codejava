
package j03026;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class J03026 {
    static long[] fibo = new long[100];
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t --> 0){
            String a = sc.nextLine(), b = sc.nextLine();
            if (a.equals(b)) System.out.println("-1");
            else System.out.println(Math.max(a.length(), b.length()));
        }
		sc.close();
	}

}
