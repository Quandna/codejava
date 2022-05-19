package j05049;
import java.util.*;
public class J05049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  t= Integer.parseInt(sc.nextLine());
        ArrayList<NXHang> ds = new ArrayList<>();
        while(t-->0){
            NXHang p = new NXHang(sc.nextLine(),Integer.parseInt(sc.nextLine()));
            ds.add(p);
        }
        String a = sc.nextLine();
        Collections.sort(ds);
        for(NXHang i:ds){
            String b = i.getName();
            if(b.contains(a)){
                System.out.println(i);
            }            
        }
    }
}
