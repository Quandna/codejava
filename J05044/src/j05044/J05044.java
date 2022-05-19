package j05044;
import java.util.*;
public class J05044 {
     public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int t = Integer.parseInt(sc.nextLine());
       ArrayList<CVNV> ds = new ArrayList<>();
       
       for(int i =1 ;i<=t;i++){
           CVNV p = new CVNV(i,sc.nextLine(),sc.nextLine(),Long.parseLong(sc.nextLine()),Long.parseLong(sc.nextLine()));
           ds.add(p);
           
       }
       String s = sc.nextLine();
       for(CVNV i:ds){
           String tmp = i.getCv();
           if(tmp.compareTo(s)==0){
               System.out.println(i);
           }          
       }
    }
    
}
