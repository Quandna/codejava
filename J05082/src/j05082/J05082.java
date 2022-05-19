package j05082;
import java.text.ParseException;
import java.util.*;
public class J05082 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner (System.in);
        ArrayList<KhachHang> ds = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int j = 1;j <= t;j++){
            KhachHang p = new KhachHang(j,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            ds.add(p);
        }
        Collections.sort(ds);
        for(KhachHang i:ds){
            System.out.println(i);
        }
    }
    
}
