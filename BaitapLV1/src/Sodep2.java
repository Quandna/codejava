import java.util.*;
public class Sodep2 {
    public static int tongcs(String s) {
        int len = s.length();
        int tong = 0;
        for(int i = 0;i < len;i++)
        {
            tong += (s.charAt(i)-'0');
        }
        return tong;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0) {
            String s;
            s = sc.nextLine();
            int len = s.length();
            int tong = tongcs(s);
            if(s.charAt(0) != '8' || tong %10 != 0) {
                System.out.println("NO");
            } else {
                int check = 0;
                for(int i = 0;i <= (len/2)+1;i++)
                    {
                         if(s.charAt(i) == s.charAt(len-i-1))
                            {
                                check = 0;
                            }
                            else {
                                check = 1;
                            break;
                        }
                    }
                    if(check == 0) System.out.println("YES");
                    else System.out.println("NO");
            }
        }
    }
}
