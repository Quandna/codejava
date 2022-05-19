package j05018;
import java.util.*;
public class J05018 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t  = Integer.parseInt(sc.nextLine());
        int n=0;
        ArrayList<BangDiem> ds = new ArrayList<>();
        while(t-->0){
            n++;
            BangDiem d = new BangDiem(n,sc.nextLine(),sc.nextLine());
            ds.add(d);
            
        }
        Collections.sort(ds);
        for(BangDiem i:ds){
            System.out.println(i);
        }
    }
    
}
