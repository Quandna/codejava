import java.util.*;
public class Hcn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long n,m;
        n = sc.nextLong();
        m = sc.nextLong();
        int d = 0;
        if(n <= 0 || m <= 0)
        {
            System.out.print("0");
        }
        else
        {
            Long s,p;
            s = (m+n)*2;
            p=m*n;
            System.out.print(s+" "+p);
        }
    }
}
