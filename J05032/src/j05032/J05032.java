
package j05032;
import java.text.ParseException;
import java.util.*;
public class J05032 {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SoSanh> ds = new ArrayList<>();
        while(t-->0){
            SoSanh p = new SoSanh(sc.next(),sc.next());
            ds.add(p);
        }
        Collections.sort(ds);
        int n = ds.size();
        System.out.println(ds.get(0));
        System.out.println(ds.get(n-1));
    }
    
}
