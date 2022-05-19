package j05048;
import java.util.*;
public class J05048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  t= Integer.parseInt(sc.nextLine());
        ArrayList<NXHang> ds = new ArrayList<>();
        while(t-->0){
            NXHang p = new NXHang(sc.nextLine(),Integer.parseInt(sc.nextLine()));
            ds.add(p);
        }
        for(NXHang i:ds){
            System.out.println(i);
        }
    }
    
}
