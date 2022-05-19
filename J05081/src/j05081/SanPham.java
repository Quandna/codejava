
package j05081;
import java.util.*;
public class SanPham implements Comparable<SanPham>{
    private String ma,ten,donvi;
    private long giamua,giaban,loinhuan;
    public SanPham (int n,String ten,String donvi,long giamua,long giaban)  {
        this.ma = "MH"+String.format("%03d", n);
        this.ten = ten;
        this.donvi = donvi;
        this.giaban = giaban;
        this.giamua = giamua;
        this.loinhuan = giaban-giamua;
    }

   
    
    @Override
    public int compareTo(SanPham s){
        if(this.loinhuan>s.loinhuan) return -1;
        if(this.loinhuan < s.loinhuan) return 1;
        return 0;
    }
    
    @Override
    public String toString(){
        return ma+" "+ten+" "+donvi+" "+giamua+" "+giaban+" "+loinhuan;
    }
    
}
