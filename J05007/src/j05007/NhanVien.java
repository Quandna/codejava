
package j05007;
import java.util.*;
import java.text.*;
public class NhanVien implements Comparable<NhanVien>{
    private String ma,ten ,gtinh,diachi,msthue;
    private Date ns,nkhd;
    public NhanVien(int n,String ten,String gtinh,String ns,String diachi,String msthue,String nkhd) throws ParseException{
        this.ma = "000"+String.format("%02d", n);
        this.ten = ten;
        this.gtinh= gtinh;
        this.ns = new SimpleDateFormat("dd/MM/yyyy").parse(ns);
        this.diachi=diachi;
        this.msthue = msthue;
        this.nkhd = new SimpleDateFormat("dd/MM/yyyy").parse(nkhd);
    }

    @Override
    public int compareTo(NhanVien o) {
        if(this.ns.before(o.ns)) return -1;
        if(this.ns.after(o.ns)) return 1;
        return 0;
    }
    @Override
    public String toString(){
        return ma+" "+ten+" "+gtinh+" "+new SimpleDateFormat("dd/MM/yyyy").format(ns)+" "+diachi+" "+msthue+" "+new SimpleDateFormat("dd/MM/yyyy").format(nkhd);
    }
}
