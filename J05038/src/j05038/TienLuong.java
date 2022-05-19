package j05038;
import java.util.*;
class TienLuong {
    private String ma,ten,chucvu;
    private long luongngay,snc,thuong,luongthang,phucap,thuclinh;
    public TienLuong(int n,String ten,long luongngay,long snc,String chucvu){
        this.ma = "NV"+String.format("%02d", n);
        this.ten = ten;
        this.luongngay=luongngay;
        this.snc=snc;
        this.chucvu=chucvu;
        this.luongthang=luongngay*snc;
        this.thuong = Thuong(luongthang,snc);
        this.phucap = PhuCap(chucvu);
        this.thuclinh=luongthang+thuong+phucap;
        
    }
    private long Thuong(long lt,long snc){
        if(snc>=25) return lt*1/5;
        else if(snc>=22) return lt*1/10;
        else return 0;
    }
    private long PhuCap(String s){
        s = chucvu;
        if(s.compareTo("GD")==0) return 250000;
        else if(s.compareTo("PGD")==0) return 200000;
        else if(s.compareTo("TP")==0) return 180000;
        else return 150000;
    }
    public long getLuong(){
        return thuclinh;
    }
    
    @Override
    public String toString(){
        return ma+" "+ten+" "+luongthang+" "+thuong+" "+phucap+" "+thuclinh;
    }
}
