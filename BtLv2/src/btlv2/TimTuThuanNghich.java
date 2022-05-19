package btlv2;
import java.util.*;

public class TimTuThuanNghich {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ds[] = new String[1000];
        int n = 0, dem[] = new int[1000];
        while(in.hasNext()) {
            String tmp = in.next();
            if(thuanNghich(tmp)) {
                int t = tim(tmp, ds , n);
                if(t == -1) {
                    ds[n] = tmp;
                    dem[n] = 1;
                    n++;
                } else {
                    dem[t]++;
                }
            }
        }
        int max = 0;
        for(int i = 0;i < n;i++) {
            if(ds[i].length() > max) max = ds[i].length();
        }
        for(int i = 0;i < n;i++) {
            if(ds[i].length() == max) {
                System.out.println(ds[i] + " " + dem[i]);
            }
        }
    }
    public static boolean thuanNghich(String s) {
        StringBuilder rs = new StringBuilder(s);
        rs.reverse();
        return (s.equals(rs.toString()));
    }
    
    public static int tim(String s, String ds[],int n) {
        for(int i = 0;i < n;i++){
            if(s.equals(ds[i])) return i;
        }
        return -1;
    }
}
