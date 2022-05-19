
package j05036;
import java.util.*;
public class GiaBan {
    private String ma,ten,donvi;
    private long phivanchuyen,thanhtien,giaban,gianhap,soluong;
    public GiaBan(int n,String ten,String donvi,long gianhap,long soluong){
        this.ma = "MH"+String.format("%02d", n);
        this.ten = ten;
        this.donvi=donvi;
        this.gianhap = gianhap;
        this.soluong = soluong;
        this.phivanchuyen = (long) Math.round(gianhap*soluong*0.05);
        this.thanhtien = (long) Math.round(gianhap*soluong+phivanchuyen);
        this.giaban = (long) Math.round(thanhtien*1.02);
    }
       
    public String toString(){
        return ma+" "+ten+" "+donvi+" "+(phivanchuyen)+" "+(thanhtien)+" "+giaban;
    }
}
