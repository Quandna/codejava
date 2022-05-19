package dssp1711;
import java.util.*;
import java.io.*;
public class DSSP1711 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SanPham> ds = new ArrayList<>();
        while(t-->0){
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            long gia = Long.parseLong(sc.nextLine());
            long bh = Long.parseLong(sc.nextLine());
            SanPham p = new SanPham(ma, ten, gia, bh);
            ds.add(p);
        }
        Collections.sort(ds);
        for(SanPham i:ds){
            System.out.println(i);
        }
    }
    
}
