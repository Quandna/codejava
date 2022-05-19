package j05029;
import java.util.*;
public class J05029 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<DoanhNghiep> ds = new ArrayList<>();
        ArrayList<Khoang> kh = new ArrayList<>();
        while(t-->0){
           String name=sc.nextLine();
           String ma=sc.nextLine();
           int so=sc.nextInt();
            DoanhNghiep p = new DoanhNghiep(name,ma,so);
            ds.add(p);
            sc.nextLine();
        }
        Collections.sort(ds);
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            int dau = sc.nextInt();
            int cuoi = sc.nextInt();
            Khoang p =new Khoang(dau, cuoi);
            kh.add(p);
        }
        
        for(Khoang i:kh){
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU "+i.getDau()+" DEN "+i.getCuoi()+" SINH VIEN:");                                    
            for(DoanhNghiep j:ds){
           if(j.getIndex()>=i.getDau()&&i.getCuoi()>=j.getIndex()){
               System.out.println(j);
           }
        }
        
    }
}
}
    
