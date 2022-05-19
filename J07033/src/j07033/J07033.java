package j07033;
import java.util.*;
import java.io.*;
public class J07033 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> ds = new ArrayList<>();
        while(t-->0){
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            SinhVien p = new SinhVien(ma,ten,lop,email);
            ds.add(p);
        }
        Collections.sort(ds);
        for(SinhVien i:ds){
            System.out.println(i);
        }
    }
    
}
