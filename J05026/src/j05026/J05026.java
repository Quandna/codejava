package j05026;
import java.util.*;
public class J05026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<GiangVien> ds = new ArrayList<>();
        int n = 0;
        while(t-->0){
            n++;
            GiangVien p = new GiangVien(n,sc.nextLine(),sc.nextLine());
            ds.add(p);
        }
        int x = Integer.parseInt(sc.nextLine());
        while(x-->0){
            String s = sc.nextLine();
            String tmp = rutGon(s);
            System.out.println("DANH SACH GIANG VIEN BO MON "+tmp+":");
            for(GiangVien i:ds){
                if(i.GetKhoa().contains(tmp)){
                    System.out.println(i);
                }
            }
        }
    }
    
    private static String rutGon(String s){
        StringBuilder kq = new StringBuilder();
        StringTokenizer st = new StringTokenizer(s);
        while(st.hasMoreTokens()){
            String tmp = st.nextToken();
            kq.append(Character.toUpperCase(tmp.charAt(0)));
        }
        return kq.toString();
    }
}
