
package j05037;
import java.util.*;
public class J05037 {
    public static void main(String[] args) {
        ArrayList<GiaBan> s=new ArrayList<>();
        Scanner in=new Scanner(System.in);
        int t=Integer.parseInt(in.nextLine());
        for(int i=1;i<=t;i++){
            GiaBan p=new GiaBan(i,in.nextLine(),in.nextLine(),in.nextLong(),in.nextLong());
            s.add(p);
            in.nextLine();
        }
        Collections.sort(s);
        for(GiaBan j:s){
            System.out.println(j);
        }
    }
    
}
