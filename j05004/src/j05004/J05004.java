package j05004;
import java.text.*;
import java.util.*;
public class J05004 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> ds = new ArrayList<>();
        for(int i=1;i<=n;i++){
        SinhVien p = new SinhVien(i,sc.nextLine(),sc.nextLine(),sc.nextLine(),Float.parseFloat(sc.nextLine()));
        ds.add(p);
        }
        for(SinhVien tmp:ds){
            System.out.println(tmp);
        }
    }
    
}
