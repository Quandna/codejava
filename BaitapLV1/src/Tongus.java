import java.util.*;
public class Tongus {
    // tao mang ktra snt
    public static boolean [] checksnt = new boolean[2000006]; // 2x1e6+6  chu y khai bao phan tu mang LOI IR
    // mang luu cac snt tu 1->sqrt2000005
    public static int [] arraySnt = new int[200005];  //2x1e5+5
    
    public static void sangNt() {
        Arrays.fill(checksnt,true); // khoi tao mang checksnt tat ca phan tu = true
        checksnt[0] = false; 
        checksnt[1] =false;
        int k = 0;
        for(int i = 2 ; i *i<=2000005 ; i++) { // 1e5
            if(checksnt[i] == true) {
                arraySnt[k] = i;
                k++;
                for(int j = i*i;j <= 2000005;j +=i) { //1e5
                    checksnt[j] = false;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i= 0;i < n;i++) {
            arr[i] = sc.nextInt();
        }
        sangNt(); // sang snt
        long kq = 0; 
        for(int  i = 0;i < n;i++) {
            
            if(checksnt[arr[i]] == true) {
                kq += arr[i]; // ktra neu la so ng to thi cong vao bien kq
            } else {
                int k = 0; 
                while(arr[i] != 1) {
                    while(arr[i] % arraySnt[k] == 0) {
                        kq += arraySnt[k];
                        arr[i] /= arraySnt[k];
                    }
                    if(checksnt[arr[i]]) {
                        kq += arr[i];
                        break;
                    }
                    k++;
                }              
            }       
        } // for
        
        System.out.println(kq);
                sc.close();
    }
}
