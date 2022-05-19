
package monhocktra;
import java.util.*;
import java.io.*;
public class MonHocKtra {

    public static void main(String[] args) throws FileNotFoundException {
       Scanner sc = new Scanner(new File("MONHOC.in"));
       int n = Integer.parseInt(sc.nextLine());
       ArrayList<MONHOC> ds = new ArrayList<>();
       while(n-->0){
           MONHOC p = new MONHOC(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()));
           ds.add(p);
       }
       Collections.sort(ds);
       for(MONHOC i:ds){
           System.out.println(i);
       }
    }
    
}
