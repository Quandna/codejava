package j03009;
import java.util.*;
/**
 *
 * @author ADMIN
 */
public class J03009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
	sc.nextLine();
	while (t --> 0){
		Set<String> set1 = new HashSet<>();
		Set<String> set2 = new HashSet<>();
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		StringTokenizer stk = new StringTokenizer(s1);
		while (stk.hasMoreTokens()) set1.add(stk.nextToken());
		stk = new StringTokenizer(s2);
		while (stk.hasMoreTokens()) set2.add(stk.nextToken());
		for (String x: set1){
			if (set2.contains(x)) continue;
			else System.out.print(x + " ");
		}
		System.out.println();
	}
	sc.close();
    }
    
}
