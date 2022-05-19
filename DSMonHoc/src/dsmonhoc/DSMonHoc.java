
package dsmonhoc;
import java.util.*;
import java.io.*;
public class DSMonHoc {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<MonHoc> ds = new ArrayList<>();
        for(int i = 1;i<=n;i++){
        MonHoc p = new MonHoc(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()));
        ds.add(p);
        }
        Collections.sort(ds);
        for(MonHoc i:ds){
            System.out.println(i);
        }
    }
    
}
