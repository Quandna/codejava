package j05047;
import java.util.*;
public class J05047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Kho> ds = new ArrayList<>();
        Map<String,Integer> map = new HashMap<String,Integer>();
        while(t-->0){
            String s = sc.nextLine(); // nhập tên
            int sl = sc.nextInt();
            int dongia = sc.nextInt();
            int n =0;
            
            StringBuilder kq = new StringBuilder();
            StringTokenizer st = new StringTokenizer(s);
            
            int k = st.countTokens()-1;
            while(k-->0){ //chuẩn hóa mã
                String m = st.nextToken();
                kq.append(Character.toUpperCase(m.charAt(0)));
            }
            String ma = kq.toString();
            
            Kho p ;
            if(map.containsKey(ma) == false){
                map.put(ma,1);
                p = new Kho(s,ma,sl,dongia,map.get(ma));
            } else{
                map.put(ma,map.get(ma)+1);
                p = new Kho(s,ma,sl,dongia,map.get(ma));
            }            
            sc.nextLine();
            ds.add(p);
        }           
            Collections.sort(ds);
            for(Kho i:ds){
                System.out.println(i);
            }
        
    }
    
}
