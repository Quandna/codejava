
package dslt1711;
import java.util.*;
import java.io.*;
import java.text.ParseException;
/**
 *
 * @author ADMIN
 */
public class DSLT1711 {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc  = new Scanner(new File("KHACH.in"));
        ArrayList<Khach> ds = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        int i = 0;
        while(t-->0){
            i++;
            String ten = sc.nextLine();
            String maphong = sc.nextLine();
            String ngayden = sc.nextLine();
            String ngaydi = sc.nextLine();
            Khach p = new Khach(i, ten, maphong, ngayden, ngaydi);
            ds.add(p);
        }
        Collections.sort(ds);
        for(Khach h:ds){
            System.out.println(h);
        }
    }
    
}
