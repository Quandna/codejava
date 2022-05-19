
package j05007;
import java.text.ParseException;
import java.util.*;
public class J05007 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien> ds = new ArrayList<>();
        for(int i = 1;i<=t;i++){
            String a=sc.nextLine();
            String b=sc.nextLine();
            String c=sc.nextLine();
            String d=sc.nextLine();
            String e=sc.nextLine();
            String f=sc.nextLine();
            NhanVien p = new NhanVien(i,a,b,c,d,e,f);
            ds.add(p);
            
        }
        Collections.sort(ds);
        for(NhanVien i:ds){
            System.out.println(i);
        }
    }
    
}
