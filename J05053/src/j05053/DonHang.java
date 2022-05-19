
package j05053;
import java.util.*;
class DonHang implements Comparable<DonHang>{
    private String ten,ma,stt;
    private long dongia,giamgia,thanhtien;
    private int soluong;
    public DonHang(String ten,String ma,long dongia,int soluong){
        this.ten = ten;
        this.ma = ma;
        this.stt= STT(ma);
        this.dongia=dongia;
        this.soluong=soluong;
        this.giamgia = GiamGia(dongia, soluong, ma);
        this.thanhtien = TinhTien(giamgia, soluong, dongia);
    }
    
    private String getMa(String s){
        String s1 = s.charAt(4)+"";
        return s1;
    }
    
    private long GiamGia(long dongia,int soluong,String ma){
        String s = getMa(ma);        
        if(s.compareTo("1")==0){
           return (long)(dongia*0.5*soluong);
        }else{
           return(long)(dongia*0.3*soluong);
        }
        
    }
    private long TinhTien(long giamgia,int soluong,long dongia){
        long tong = 0;
        return tong = soluong*dongia-giamgia;
    }
    
    private String STT(String s){
        String s1 = s.substring(1,4);
        return s1;
    }
    
    @Override
    public String toString(){
        return ten+" "+(ma)+" "+stt+" "+giamgia+" "+thanhtien; 
    }
    
    @Override
    public int compareTo(DonHang o){
        return (this.stt.compareTo(o.stt));
    }
    
}

