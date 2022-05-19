import java.util.*;
public class Ktsofibo {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n= sc.nextLong();
            long f1 = 1,f2 = 1,fn=0;
            if(n == 1) {
                System.out.println("YES");
            } else {
                while(fn < n){
                    fn = f1+f2;
                    f1 = f2;
                    f2 = fn;
                }
                if(fn == n) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}
