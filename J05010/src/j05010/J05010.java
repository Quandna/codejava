package j05010;
import java.util.*;
public class J05010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Hang> ds = new ArrayList<>();
        int n = 0;
        while(t-->0){
            n++;
            Hang p = new Hang(n,sc.nextLine(),sc.nextLine(),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()));
            ds.add(p);
            
        }
        Collections.sort(ds);
        for(Hang i:ds){
            System.out.println(i);
        }
    }
    
}
