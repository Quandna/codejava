
package sinhvien;
import java.util.*;
import java.io.*;
public class SinhVien {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SV1> ds = new ArrayList<>();
        while(n-->0){
            SV1 p = new SV1(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            ds.add(p);
        }
        Collections.sort(ds);
        for(SV1 i:ds){
            System.out.println(i);
        }
    }
    
}
