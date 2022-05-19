import java.util.*;
public class SXChonNguoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0;i < n;i++) {
            a[i] = sc.nextInt();
        }
        sapxep(a,n);
    
    }
    public static void sapxep(int a[],int n) {
        int i,j,min;
        int dem = 0;
        ArrayList<String> kq = new ArrayList<>();
        for(i = 0;i < n-1;i++) {
            min = i;
            for(j = i+1;j<n;j++) {
                if(a[j]<a[min]){
                    min=j;
                }
            }
            int tmp = a[min];
            a[min]=a[i];
            a[i] = tmp;
            String tmp1 = "Buoc "+ (dem+1) +":";
            for(int h = 0;h < n;h++)
            {
                tmp1 = tmp1+" "+a[h];
            }
            kq.add(tmp1);
            dem++;
        }
        Collections.reverse(kq);
        for(String s : kq){
            System.out.println(s);
    }
}
}