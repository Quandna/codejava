package testson;
import java.util.*;
import java.io.*;
import java.text.ParseException;
public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("KHACH.in"));
        ArrayList<KhachHang> ds = new ArrayList<>();
        int q = Integer.parseInt(sc.nextLine());
        int i = 1;
        while (i <= q) {            
            KhachHang x = new KhachHang(i,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            ds.add(x);
            i++;
        }
        Collections.sort(ds);
        for (KhachHang d : ds) {
            System.out.println(d);
        }
    }
}