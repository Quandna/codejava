package j05064;
import java.util.*;
public class J05064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<TNGV> ds = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            TNGV p = new TNGV(sc.nextLine(),sc.nextLine(),Long.parseLong(sc.nextLine()));
            ds.add(p);
        }
        int ht = 0;
        int hp = 0;
        for(int i =0;i<ds.size();i++){
            if(ht < 1&& ds.get(i).getMa().equals("HT")){
                ht++; // ht =1;
                System.out.println(ds.get(i));
            }else if(hp < 2 && ds.get(i).getMa().equals("HP")){
                hp++;
                System.out.println(ds.get(i));
            }
            else if(ds.get(i).getMa().equals("GV")){
                System.out.println(ds.get(i));
            }
        }
    }
    
}
