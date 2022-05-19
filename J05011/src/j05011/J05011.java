package j05011;
import java.util.*;
import java.text.*;
public class J05011 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<TinhGio> ds = new ArrayList<>();
        while(t-->0){
            TinhGio p = new TinhGio(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            ds.add(p);
        }
        Collections.sort(ds);
        for(TinhGio i:ds){
            System.out.println(i);
        }
    }
    
}
