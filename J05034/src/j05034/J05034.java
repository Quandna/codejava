package j05034;
import java.util.*;
public class J05034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SVTT> ds = new ArrayList<>();
        int i = 0;
        while(t-->0){
            i++;
            SVTT p = new SVTT(i,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            ds.add(p);
        }
        Collections.sort(ds);
        int n = Integer.parseInt(sc.nextLine());
        while(n-->0){
            String s = sc.nextLine();
            for(SVTT j:ds){
                if(j.getCty().compareTo(s)==0){
                    System.out.println(j);
                }
            }
        }
        
    }
    
}
