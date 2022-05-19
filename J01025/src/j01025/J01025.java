package j01025;
import java.math.*;
import java.util.*;
public class J01025{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int [4];
        int[] b = new int [4];
        for (int i=0; i<4; i++) a[i] = sc.nextInt();
        for (int i=0; i<4; i++) b[i] = sc.nextInt();
        int x1 = Math.abs(a[0] - b[2]);
        int x2 = Math.abs(a[1] - b[3]);
        int y1 = Math.abs(a[2] - b[0]);
        int y2 = Math.abs(a[3] - b[1]);
        int x = Math.max(Math.max(x1, x2), Math.max(y1, y2));
        int p = Math.max(Math.abs(a[0]-a[2]), Math.abs(a[1]-a[3]));
        int q = Math.max(Math.abs(b[0]-b[2]), Math.abs(b[1]-b[3]));
        x = Math.max(x, Math.max(p, q));
        System.out.println(x*x);
		sc.close();
	}
}