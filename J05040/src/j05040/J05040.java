package j05040;
import java.util.*;
public class J05040 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int t = Integer.parseInt(sc.nextLine());
       ArrayList<TinhCong> ds = new ArrayList<>();
       for(int i =1 ;i<=t ;i++){
           TinhCong p = new TinhCong(i,sc.nextLine(),Long.parseLong(sc.nextLine()),Integer.parseInt(sc.nextLine()),sc.nextLine());
           ds.add(p);
       }
       for(TinhCong i:ds){
           System.out.println(i);
       }
    }
    
}
