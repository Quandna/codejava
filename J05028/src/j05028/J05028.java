package j05028;
import java.util.*;
public class J05028 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<DoanhNghiep> ds = new ArrayList<>();
        while(t-->0){
            DoanhNghiep p = new DoanhNghiep(sc.nextLine(),sc.nextLine(),Long.parseLong(sc.nextLine()));
            ds.add(p);
        }
        Collections.sort(ds);
        for(DoanhNghiep i:ds){
            System.out.println(i);
        }
    }
    
}
