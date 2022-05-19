package j05054;
import java.util.*;
public class J05054 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<HS> s = new ArrayList<>();
        ArrayList<Float> a = new ArrayList<>();
        Map<Float,Integer> b = new HashMap<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i = 1;i<=t;i++){
            HS p = new HS(i,sc.nextLine(),sc.nextFloat());
            a.add(p.getDtb());
            s.add(p);
            sc.nextLine();
        }
        Collections.sort(a);
        Collections.reverse(a); // đảo ngược sắp xếp từ trên xuống
        for(int i = 0;i < a.size();i++){
            if(b.containsKey(a.get(i))==false){
                b.put(a.get(i), i+1); // put thứ hạng với điểm trung bình vào map
            }
        }
        for(HS j : s){
            int n = b.get(j.getDtb()); // lấy ra thứ hạng được lưu với điểm trung bình này
            System.out.println(j+" "+n);
        }
    }
    
}
