package j05033;
import java.util.*;
public class J05033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SXTG> ds = new ArrayList<>();
        
        while(t-->0){
            SXTG p = new SXTG(sc.nextInt(),sc.nextInt(),sc.nextInt());
            ds.add(p);
        }
        Collections.sort(ds);
        for(SXTG i:ds){
            System.out.println(i);
        }
    }
    
}
