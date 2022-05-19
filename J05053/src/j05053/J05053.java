package j05053;
import java.util.*;
public class J05053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<DonHang> ds = new ArrayList<>();
        while(t-->0){
            DonHang p = new DonHang(sc.nextLine(),sc.nextLine(),sc.nextLong(),sc.nextInt());
            ds.add(p);
            sc.nextLine();
        }
        Collections.sort(ds);
        for(DonHang i:ds){
            System.out.println(i);
        }
    }
    
}
    

