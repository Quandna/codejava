package j05046;
import java.util.*;
public class J05046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());        
        Map<String,Integer> map = new HashMap<String,Integer>();
        while(t-->0){
            String name = sc.nextLine();
            int sl = sc.nextInt();
            int dg = sc.nextInt();
            Kho p = new Kho(name, sl, dg);
            if(map.containsKey(p.getMa())==false){ // key không có trong map
                map.put(p.getMa(), 1);
                System.out.println(p.getMa()+String.format("%02d", 1)+" "+p);
            }
            else {
                int x = map.get(p.getMa());
                map.put(p.getMa(),x+1);
                System.out.println(p.getMa()+String.format("%02d",x+1)+" "+p);
            }           
            sc.nextLine();          
        }
    }
}
