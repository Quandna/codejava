
package dslt1711;
import java.util.*;
import java.io.*;
import java.text.*;
/**
 *
 * @author ADMIN
 */
public class Khach implements Comparable<Khach>{
    private String ma,ten,maphong;
    private Date ngayden,ngaydi;
    long ngay;
    public Khach(int n,String ten,String maphong,String ngayden,String ngaydi) throws ParseException{
        this.ma = "KH"+String.format("%02d",n);
        this.ten = ten;
        this.maphong = maphong;
        this.ngayden = new SimpleDateFormat("dd/MM/yyyy").parse(ngayden);
        this.ngaydi = new SimpleDateFormat("dd/MM/yyyy").parse(ngaydi);
        this.ngay = (long) (this.ngaydi.getTime() - this.ngayden.getTime()) / (24 * 60 * 60 * 1000);
    }
    @Override
    public int compareTo(Khach o){
        if (this.ngay == o.ngay) return 0;
        else return (this.ngay > o.ngay) ?-1:1;
    }
    
    @Override
    public String toString(){
        return ma+" "+ten+" "+maphong+" "+ngay;
    }
    
}
