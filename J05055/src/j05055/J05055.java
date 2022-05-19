package j05055;
import java.text.ParseException;
import java.util.*;
public class J05055 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);       
        ArrayList<VDV> ds = new ArrayList<>();
        ArrayList<String> a = new ArrayList<>();
        Map<String,Integer> b = new HashMap<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i = 1;i<=t;i++){
            VDV p = new VDV(i,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            a.add(p.getTg());
            ds.add(p);
            
        }
        Collections.sort(a);
        Collections.reverse(a); // đảo ngược sắp xếp từ trên xuống
        for(int i = 0;i < a.size();i++){
            if(b.containsKey(a.get(i))==false){
                b.put(a.get(i), i+1); // put thứ hạng với điểm trung bình vào map
            }
        }
        for(VDV j : ds){
            int n = b.get(j.getTg()); // lấy ra thứ hạng được lưu với điểm trung bình này
            System.out.println(j+" "+n);
        }
    }
    
}
