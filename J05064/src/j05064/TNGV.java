package j05064;
import java.util.*;
class TNGV {
    private String ma,ten;
    private long luongcb,phucap,tong;
    private int bacluong;
    public TNGV(String ma,String ten,long luongcb){
        this.ma = ma;
        this.ten = ten;
        this.luongcb = luongcb;
        this.phucap = PhuCap(ma);
        this.bacluong = BacLuong(ma);
        this.tong = Tong(bacluong, phucap, luongcb);
        
    }

    private long PhuCap(String ma) {
        String tmp = ma.substring(0,2);
        if(tmp.equals("HT"))return 2000000;
        else if(tmp.equals("HP")) return 900000;
        else return 500000;
    }
    private int BacLuong(String ma){
        String tmp = ma.substring(2,4);
        int t = Integer.parseInt(tmp);
        return t;
    }
    
    private long Tong(int bacluong,long phucap,long luongcb){
        long tongluong = luongcb*bacluong+phucap;
        return tongluong;
    }
    public String getMa(){
        String tmp = this.ma.substring(0,2);
        return tmp;
    }
    
    @Override
    public String toString(){
        return ma+" "+ten+" "+bacluong+" "+phucap+" "+tong;
    }
}
