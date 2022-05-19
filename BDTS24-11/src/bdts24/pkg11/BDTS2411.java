package bdts24.pkg11;
import java.util.*;
import java.io.*;
public class BDTS2411 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("THISINH.in"));
        int t= Integer.parseInt(sc.nextLine());
        ArrayList<DTS> ds = new ArrayList<>();
        int n = 0;
        while(t-->0){
            n++;
            DTS p = new DTS(n,sc.nextLine(),Float.parseFloat(sc.nextLine()),sc.nextLine(),Integer.parseInt(sc.nextLine()));
            ds.add(p);
        }
        Collections.sort(ds);
        for(DTS i:ds){
            System.out.println(i);
        }
    }
    
}
