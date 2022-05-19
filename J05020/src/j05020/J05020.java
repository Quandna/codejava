
package j05020;
import java.util.*;
public class J05020 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien05020> ds = new ArrayList<>();
        for(int i=1;i<=t;i++){
            String a = sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            String d = sc.nextLine();
            
            SinhVien05020 p = new SinhVien05020(a,b,c,d);
            ds.add(p);
        }
        Collections.sort(ds);
        for(SinhVien05020 i:ds){
            System.out.println(i);
        }
    }
    
}
