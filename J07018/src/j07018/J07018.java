package j07018;
import java.io.*;
import java.util.*;
import java.text.*;
public class J07018 {
    public static void main(String[] args) throws IOException, ParseException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        ArrayList<SinhVien> ar = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        
        int n = 0;
        while(t-->0){
            n++;
            String a = sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            Float d = Float.parseFloat(sc.nextLine());
            
            SinhVien p  = new SinhVien(n,a,b,c,d);
            ar.add(p);
        }
        for(SinhVien i:ar){
            System.out.println(i);
        }
    
    }
}
