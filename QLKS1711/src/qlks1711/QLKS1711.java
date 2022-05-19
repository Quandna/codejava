package qlks1711;
import java.util.*;
import java.io.*;
import java.text.*;
public class QLKS1711 {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("DATA.in"));
        ArrayList<Phong> LP = new ArrayList<>();
        
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            Phong p = new Phong(sc.nextLine());
            LP.add(p);
        }
        ArrayList<TTKH> dskh = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        int i = 1;
        while(n-->0){
            TTKH x = new TTKH(i,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            dskh.add(x);
            i++;
        }
        Collections.sort(dskh);{
        for(TTKH kh:dskh){
            for(Phong phong : LP){
                if(phong.check(kh.getMa())){
                    double dongia = phong.getGia()*kh.getNgay();
                    double phucvu = dongia*phong.getPPV();
                    double pay1 = dongia+phucvu;
                    double giamgia;
                    if(kh.getNgay()<10) giamgia = 0;
                    else if(kh.getNgay()<20) giamgia = 0.02;
                    else if(kh.getNgay()<30) giamgia = 0.04;
                    else giamgia = 0.06;
                    kh.TinhTien(pay1-pay1*giamgia);
                    break;
                }
            }
        }
        for(TTKH l:dskh){
            System.out.println(l);
        }
    }
    }
    
}
