package j05003;
import java.util.*;
import java.text.*;
public class J05003 {
     public static void main(String[] args) throws ParseException
    {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        ArrayList<SinhVien> ds = new ArrayList<>();
        for(int i=1;i<=n;i++){
           SinhVien a = new SinhVien(i,in.nextLine(),in.nextLine(),in.nextLine(),Float.parseFloat(in.nextLine()));
            ds.add(a);
        }
        for(SinhVien tmp:ds){
            System.out.println(tmp);
    }
    
}
    
}
