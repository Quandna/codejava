package j05051;
import java.util.*;
public class J05051 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<TienDien> ds = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        int i = 0;
        while(t-->0){
            i++;
            TienDien p = new TienDien(i,sc.nextLine(),sc.nextLong(),sc.nextLong());
            ds.add(p);
            sc.nextLine();
        }
        Collections.sort(ds);
        for(TienDien j:ds){
            System.out.println(j);
        }
    }
}
