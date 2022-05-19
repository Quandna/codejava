package j05045;
import java.util.*;
public class J05045 {

   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int t = Integer.parseInt(sc.nextLine());
       ArrayList<TNNV> ds = new ArrayList<>();
       
       for(int i =1 ;i<=t;i++){
           TNNV p = new TNNV(i,sc.nextLine(),sc.nextLine(),Long.parseLong(sc.nextLine()),Long.parseLong(sc.nextLine()));
           ds.add(p);
           
       }
       Collections.sort(ds);
       for(TNNV i:ds){
           System.out.println(i);
       }
    }
}
