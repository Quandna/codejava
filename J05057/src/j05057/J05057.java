
package j05057;
import java.util.*;
/**
 *
 * @author ADMIN
 */
public class J05057 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Tinh> ds = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            Tinh p = new Tinh(sc.nextLine(),sc.nextLine(),Float.parseFloat(sc.nextLine()),Float.parseFloat(sc.nextLine()),Float.parseFloat(sc.nextLine()));
            ds.add(p);
        }
        for(Tinh i:ds){
            System.out.println(i);
        }
    }
    
}
