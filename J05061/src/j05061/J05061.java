
package j05061;
import java.util.*;
/**
 *
 * @author ADMIN
 */
public class J05061 {
        public static void main(String[] args) {
        ArrayList<Tinh> s=new ArrayList<>();
        Scanner in=new Scanner(System.in);
        int t=Integer.parseInt(in.nextLine());
        for(int i=1;i<=t;i++){
            Tinh p=new Tinh(i,in.nextLine(),in.nextLine(),in.nextFloat(),in.nextFloat());
            s.add(p);
            in.nextLine();
        }
        Collections.sort(s);
        for(Tinh j:s){
            System.out.println(j);
        }
    }
    
}
