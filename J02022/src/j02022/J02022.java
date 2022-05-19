package j02022;
import java.util.*;
public class J02022 {
    static int n;
    static boolean[] check = new boolean[11];
    static int x[] = new int[11];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
                int t = Integer.parseInt(sc.nextLine());
                x[0] = -1;
                while (t --> 0){
                    Arrays.fill(check, false);
                    n = sc.nextInt();
                    Try(1);
		}		
	}
    static void show(){
        for (int i=1; i<=n; i++) {
            System.out.print(x[i]);
        }           
        System.out.println();
    }        
        
    static void Try(int k){
		for (int i=1; i<=n; i++){
            if (!check[i] && Math.abs(i-x[k-1]) != 1){
                x[k] = i;
                check[i] = true;
                if (k==n) show();
                else Try(k+1);
                check[i] = false;
            }
            else continue;
        }
    }
}
