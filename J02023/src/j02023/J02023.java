package j02023;        
import java.util.Scanner;
public class J02023{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), s = sc.nextInt();
        if (s == 0){
            System.out.print(n == 1 ? "0 0" : "-1 -1");
            return;       
        }
        if (s > 9*n){
            System.out.println("-1 -1");
            return;
        }
		findSmallest(n,s);
        System.out.print(" ");
        findLargest(n,s);
		sc.close();
	}
    static void findLargest(int n, int s) {
        int[] res = new int[n];
        for (int i=0; i<n; i++){
            if (s > 9){
                res[i] = 9;
                s -= 9;
            }
            else{
                res[i] = s;
                s = 0;
            }
        }
        for (int i=0; i<n; i++) System.out.print(res[i]);
    }
    static void findSmallest(int n, int s){
        int[] res = new int[n];
        s -= 1;
        for (int i=n-1; i>0; i--){
            if (s > 9){
                res[i] = 9;
                s -= 9;
            }
            else{
                res[i] = s;
                s = 0;
            }
        }
        res[0] = s + 1;
        for (int i=0; i<n; i++) System.out.print(res[i]);
    
}
}