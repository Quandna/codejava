package j07037;
import java.util.*;
import java.io.*;
public class J07037 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DN.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<DN> ds = new ArrayList<>();
        while(t-->0){
            DN p = new DN(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()));
            ds.add(p);
        }
        Collections.sort(ds);
        for(DN i:ds){
            System.out.println(i);
        }
    }
    
}
