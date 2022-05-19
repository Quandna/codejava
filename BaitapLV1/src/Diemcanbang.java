import java.util.*;
public class Diemcanbang {
    public static void main(String[] args) {
        
        // CHUA XANH
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while( t > 0)
            {
                int n = sc.nextInt();
                int[] a = new int[100008];
                int tong = 0;
                for(int i = 1;i <= n;i++)
                        {
                            a[i] = sc.nextInt();
                            tong +=a[i];
                        }

                         int trai = 0,phai = 0;
                        int check = 0;
                        for(int i = 1;i <= n;i++) {
                          tong -= a[i];
                            phai = tong;
                            if(trai == phai ) {
                                check = 1;
                                System.out.println(i);
                                break;
                            }
                              trai += a[i];
                        }
                        if(check == 0) System.out.println("-1");
                t--;
            }
        }
    }
}
