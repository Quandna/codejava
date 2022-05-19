package j05027;
import java.util.*;
public class J05027 {
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
            String tmp = s.toLowerCase();          
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA "+s+":");
            for(GiangVien i:ds){
                String k = i.GetTen().toLowerCase();               
                if(k.contains(tmp)){
                    System.out.println(i);
                }
            }
        }
    }
    
    
    
}
