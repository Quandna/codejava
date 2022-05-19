package j07052;
import java.util.*;
import java.io.*;
/**
 *
 * @author ADMIN
 */
public class J07052 {
public static void main(String[] args) throws FileNotFoundException {
        ArrayList<ThiSinh> list = new ArrayList<>();
        Scanner sc = new Scanner(new File("THISINH.in"));
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            list.add(new ThiSinh(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(list, new Comparator<ThiSinh>() {
            @Override
            public int compare(ThiSinh o1, ThiSinh o2) {
                if (o2.getDiemXetTuyen() > o1.getDiemXetTuyen())return 1;
                else if (o2.getDiemXetTuyen() < o1.getDiemXetTuyen())return -1;
                else return o1.getId().compareTo(o2.getId());
            }
        });
        float diemChuan;
        int t = Integer.parseInt(sc.nextLine());
        if (t < n)diemChuan = list.get(t-1).getDiemXetTuyen();
        else diemChuan = list.get(list.size()-1).getDiemXetTuyen();
        System.out.println(diemChuan);
        for (ThiSinh x : list){
            System.out.print(x+" ");
            if (x.getDiemXetTuyen()>= diemChuan) System.out.println("TRUNG TUYEN");
            else System.out.println("TRUOT");
        }

    }
    
}
