package j07050;
import java.util.*;
import java.io.*;
public class J07050 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MATHANG.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<MatHang> ds = new ArrayList<>();
        int i  = 0;
        while(t-->0){
            i++;
            String ten = sc.nextLine();
            String loai = sc.nextLine();
            float giamua = Float.parseFloat(sc.nextLine());
            float giaban = Float.parseFloat(sc.nextLine());
            MatHang p = new MatHang(i, ten, loai, giamua, giaban);
            ds.add(p);
        }
        Collections.sort(ds);
        for(MatHang j:ds){
            System.out.println(j);
        }
    }
    
}
