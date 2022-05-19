import java.util.*;
public class Pytago {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0 ){
            int n = sc.nextInt();
            long a[] = new long[n];
            for(int i = 0;i < n;i++){
                a[i] = sc.nextLong();
            }
            int check = 0;
           long x,y,z;
           
           Arrays.sort(a); // sap xep mang a
           
           for(int i  = 0;i < n;i++){
               a[i] = (a[i]*a[i]);
           }
           
           for(int i = 0;i < n;i++){
               int trai = n-2, phai = n-1;
               x = a[i];
               while(trai > i){
                   y = a[trai];
                   z = a[phai];
                   long k = z - y;
                   if(k == x){
                       check = 1;
                       trai++;phai--;
                   }
                   else if(k > x) {
                       phai--;
                   } 
                   else {
                       trai--;
                   }
               }
           }
           if(check ==1) System.out.println("YES");
           else System.out.println("NO");
        }
    }
}
