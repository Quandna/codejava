import java.util.*;
public class SxChenNguoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), a[] = new int[100];
        for(int i = 0 ;i < n;i++){
            a[i]  = sc.nextInt();
        }
        sapxep(a,n);
    }
    
    public static void sapxep(int a[] ,int n ){
        int i,j,t;
        ArrayList<String> kq = new ArrayList<>();
        String top = "Buoc "+"0"+": "+a[0];
        kq.add(top);
        int dem = 0;
        for(i =1 ;i<n;i++){
            t = a[i];
            j = i -1;
            while(j >=0&&a[j]>t){
                a[j+1] = a[j];
                j = j-1;
            }
            a[j+1] = t;
             String tmp = "Buoc "+(dem+1)+":";
             for(int x = 0; x < i+1;x++){
                 tmp = tmp +" "+a[x];
             }
             kq.add(tmp);
             dem++;
        }
        Collections.reverse(kq);
        for(String s : kq){
            System.out.println(s);
        }
    }
    
}
