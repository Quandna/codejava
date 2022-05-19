package j05038;
import java.util.*;
public class J05038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<TienLuong> ds = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        int i = 0;
        while(t-->0){
            i++;
            String name = sc.nextLine();
            long lt = Long.parseLong(sc.nextLine());
            long snc = Long.parseLong(sc.nextLine());
            String cv = sc.nextLine();
            TienLuong p = new TienLuong(i, name,lt,snc,cv);
            ds.add(p);
        }
        long tong = 0;
        for(TienLuong j:ds){
            tong += j.getLuong();
            System.out.println(j);
        }
        System.out.println("Tong chi phi tien luong: "+tong);
    }
    
}
