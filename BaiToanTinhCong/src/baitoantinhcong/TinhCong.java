package baitoantinhcong;
import java.util.*;
public class TinhCong {
    private String ma,hvten,cv;
    private long snc,lcb,thunhap,pc,thuong,luongthang;
    

    public TinhCong( String hvten, long lcb, long snc,String cv) {
        this.ma = "NV01";
        this.hvten = hvten;
        this.lcb = lcb;       
        this.snc = snc;
        this.cv = cv;
        this.luongthang = this.lcb*snc;
        this.thuong = Thuong(snc,luongthang);      
        this.pc = Pc(cv);
        this.thunhap = this.luongthang+this.thuong+this.pc;
        
    }

    private long Thuong (long snc,long lt){
       
        if(snc >= 25 ) return lt*1/5;
        else if(snc >=22 && snc < 25) return lt*1/10;
        else return 0;
    }
    
    private long Pc(String pc){
        if(pc.compareTo("GD")==0) return 250000;
        else if(pc.compareTo("PGD") == 0) return 200000;
        else if(pc.compareTo("TP")==0) return 180000;
        else return 150000;
    }
    @Override
    public String toString() {
        return ma+" "+hvten+" "+luongthang+" "+thuong+" "+pc+" "+thunhap;
    }
}
