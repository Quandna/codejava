
package j05025;
import java.util.*;
public class J05025 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<GiangVien> ds = new ArrayList<>();
        for(int i = 1 ;i <= t;i++){
            GiangVien p = new GiangVien(i,sc.nextLine(),sc.nextLine());
            ds.add(p);
        }
        Collections.sort(ds);
        for(GiangVien i: ds){
            System.out.println(i);
        }
    }
    
}
