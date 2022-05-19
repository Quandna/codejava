package j05023;
import java.util.*;
public class J05023 {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<LKSV> ds = new ArrayList<>();
        while(t-->0){
            LKSV p = new LKSV(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            ds.add(p);
        }
        int n = Integer.parseInt(sc.nextLine());
        while(n-->0){
            String s= sc.nextLine();
            String tmp = s.substring(2,4);
            System.out.println("DANH SACH SINH VIEN KHOA "+s+":");
            for(LKSV i:ds){
                String k = i.getLop();
                if(k.contains(tmp)){
                    System.out.println(i);
                }
            }
        }
    }
}
