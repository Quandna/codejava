import java.util.*;
public class Chiahet11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            String n;
            n=sc.next();
            long luu = 0;
            for(int i = 0 ;i < n.length();i++)
            {
                luu = ( luu*10+(n.charAt(i)-'0' ))%11;
            }
            if(luu %11 == 0)
            {
                System.out.println("1");
            } else System.out.println("0");
        }
    }
}
