package j05050;
import java.util.*;
class TienDien {
    private String ma,loai;
    private long heso,thanhtien,phutroi,tong,csc,csm;
    private long sodien;
    public TienDien(int n,String loai,long csc,long csm){
        this.ma = "KH"+String.format("%02d", n);
        this.loai = loai;
        this.csc = csc;
        this.csm =csm;
        this.sodien = csm - csc;
        this.heso = HeSo(loai);
        this.thanhtien = sodien * heso *550;
        this.phutroi = PhuTroi(sodien, thanhtien);
        this.tong = thanhtien + phutroi;
    }
    
    private int HeSo(String s){
        if(s.compareTo("KD")==0) return 3;
        else if(s.compareTo("NN")==0) return 5;
        else if(s.compareTo("TT")==0) return 4;
        else return 2;
    }
    
    private long PhuTroi(long sodien,long thanhtien){
        if(sodien < 50) return 0;
        else if(sodien >= 50 && sodien <= 100) return(long) Math.round( ((long) thanhtien/100.0*35));
        else return thanhtien;
    }
    
    @Override
    public String toString(){
        return ma+" "+heso+" "+ thanhtien+" "+(phutroi)+" "+tong;
    }
}
