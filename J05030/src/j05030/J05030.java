package j05030;
import java.util.*;
public class J05030 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<BDTP> ds = new ArrayList<>();
        int i = 0;
        while(t-->0){
            
            String a = sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            float d1,d2,d3;
            d1=Float.parseFloat(sc.nextLine());
            d2=Float.parseFloat(sc.nextLine());
            d3=Float.parseFloat(sc.nextLine());
            BDTP p = new BDTP(a,b,c,d1,d2,d3);
            ds.add(p);
        }
        Collections.sort(ds);
        for(BDTP j : ds){
            i++;
            System.out.println(i+" "+j);
        }
    }
    
}
