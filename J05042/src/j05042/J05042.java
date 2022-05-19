package j05042;
import java.util.*;
public class J05042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<BXH> ds = new ArrayList<>();
        while(t-->0){
            BXH p = new BXH(sc.nextLine(),sc.nextInt(),sc.nextLong());
            ds.add(p);
            sc.nextLine();
        }
        Collections.sort(ds);
        for(BXH i:ds){
            System.out.println(i);
        }
    }
    
}
