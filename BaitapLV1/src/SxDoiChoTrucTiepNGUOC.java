import java.util.*;
public class SxDoiChoTrucTiepNGUOC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
        int n = in.nextInt(), a[] = new int[n];
        for(int i =0 ;i < n;i++) {
            a[i] = in.nextInt();
        }
        sapxep(a,n);
    }
    }
    public static void sapxep(int a[],int n) {
        int i,j,t;
        ArrayList<String> kq = new ArrayList<>();
        for(i = 0;i < n-1;i++) {
            for(j = i+1;j<n;j++) {
                if(a[i] > a[j]) {
                    t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
            String tmp = "Buoc "+(i+1)+":";
            for(j = 0;j < n;j++) {
                tmp = tmp +" "+a[j];
            }
            kq.add(tmp);
        }
        Collections.reverse(kq);
        for(String s: kq){
            System.out.println(s);
        }
    }
}
