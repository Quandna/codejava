package ttp24.pkg11;
import java.util.*;
import java.text.*;
import java.io.*;
public class TTP2411 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, ParseException {
    Scanner sc = new Scanner(new File("KHACHHANG.in"));
        ArrayList<Tinh> ds = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        int n = 0;
        while(t-->0){
            n++;
            String ten = sc.nextLine();
            String phong = (sc.nextLine());
            String den = sc.nextLine();
            String di = sc.nextLine();
            long ps = Long.parseLong(sc.nextLine());
            Tinh p = new Tinh(n,ten,phong,den,di,ps);
            ds.add(p);
            
        }
        Collections.sort(ds);
        for(Tinh i:ds){
            System.out.println(i);
        }
    }
    
}
