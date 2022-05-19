package j05003;
import java.util.*;
import java.text.*;
public class SinhVien {

    private String ma,hoten,lop;
    private Date ns;
    private float gpa;
    
    public SinhVien(int n,String hoten,String lop,String ns,Float gpa) throws ParseException {
        this.ma = "B20DCCN" + String.format("%03d", n);
        this.hoten = hoten;
        this.ns = new SimpleDateFormat("dd/MM/yyyy").parse(ns);
        this.lop = lop;
        this.gpa = gpa;
    }
    
    public String toString(){
        return ma + " " + hoten + " " + lop + " " + new SimpleDateFormat("dd/MM/yyyy").format(ns) + " " + String.format("%.2f", gpa);
    }
}
