package j05022;
import java.util.*;
public class J05022 {
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
            System.out.println("DANH SACH SINH VIEN LOP "+s+":");
            for(LKSV i:ds){
                String k = i.lop;
                if(k.contains(s)){
                    System.out.println(i);
                }
            }
        }
    }
    
}
