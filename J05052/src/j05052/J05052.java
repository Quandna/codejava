package j05052;
import java.util.*;
public class J05052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<DonHang> ds = new ArrayList<>();
        while(t-->0){
            DonHang p = new DonHang(sc.nextLine(),sc.nextLine(),sc.nextLong(),sc.nextInt());
            ds.add(p);
            sc.nextLine();
        }
        for(DonHang i:ds){
            System.out.println(i);
        }
    }
    
}
