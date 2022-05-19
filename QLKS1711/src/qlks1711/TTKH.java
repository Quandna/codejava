package qlks1711;
import java.util.*;
import java.text.*;
public  class TTKH implements Comparable<TTKH>{
    private String ma,ten,maphong;
    private Date ngayden,ngaydi;
    private long ngay;
    private double tongtien;
    
    public TTKH(int n,String ten,String maphong,String ngayden,String ngaydi) throws ParseException{
        this.ma = "KH"+String.format("%02d",n);
        this.ten = ten;
        this.maphong = maphong;
        this.ngayden = new SimpleDateFormat("dd/MM/yyyy").parse(ngayden);
        this.ngaydi = new SimpleDateFormat("dd/MM/yyyy").parse(ngaydi);
        this.ngay = tinhSoNgay();
        
    }
    private long tinhSoNgay(){
        return (long)(this.ngaydi.getTime()-this.ngayden.getTime())/(24*60*60*1000);
    }
    
    public long getNgay(){
        if(ngay == 0) return 1;
        else return ngay;
    }
    
    public String getMa(){
        String s = maphong;
        return s.charAt(2)+"";
    }
    
    
    
    public void TinhTien(double tongtien){
        this.tongtien = tongtien;
    }
    
    @Override
    public int compareTo(TTKH o){
        if(this.ngay == o.ngay) return 0;
        else return (this.ngay > o.ngay) ?-1:1;
    }
    
    
    @Override
    public String toString(){
        return ma+" "+ten+" "+maphong+" "+ngay+" "+new DecimalFormat("0.00").format(tongtien);
    }
}
