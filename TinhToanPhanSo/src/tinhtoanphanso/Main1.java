package tinhtoanphanso;
import java.util.*;
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            phanSo A = new phanSo(sc.nextLong(),sc.nextLong());
            phanSo B = new phanSo(sc.nextLong(),sc.nextLong());
            phanSo C = A.Tong(B);
            phanSo D = A.Tich(C, B);
            System.out.print(C+" ");
            System.out.println(D);
        }
    }
}
