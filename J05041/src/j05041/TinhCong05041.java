
package j05041;
import java.util.*;
public class TinhCong05041 implements Comparable<TinhCong05041>{
    private String maNV,name,Cv;
    private long luongCB,phucap,thuong,thunhap,luongThang;
    private int snc;
    public TinhCong05041(int i,String name,long luongCB,int snc,String Cv){
        this.maNV = "NV"+String.format("%02d", i);
        this.name = name;
        this.luongCB = luongCB;
        this.snc = snc;
        this.Cv = Cv;
        this.luongThang = luongCB * snc;
        this.thuong = (long)(luongThang *Thuong(snc));
        this.phucap = PhuCap(Cv);
        this.thunhap = this.luongThang+this.thuong+this.phucap;
    }
    
    private float Thuong(int snc){
        if(snc >= 25) return (float) 0.2;
        if(snc >=22 && snc <25) return (float) 0.1;
        return 0;
    }
    
    private long PhuCap(String s){
        if(s.compareTo("GD") == 0) return 250000;
        else if(s.compareTo("PGD") == 0) return 200000;
        else if(s.compareTo("TP")==0) return 180000;
        else return 150000;
    }
    @Override
    public String toString(){
        return maNV+" "+name+" "+luongThang+" "+thuong+" "+phucap+" "+thunhap;
    }
    
    @Override
    public int compareTo(TinhCong05041 o){
        if(this.thunhap>o.thunhap) return -1;
        else if(this.thunhap<o.thunhap) return 1;
        return 0;
    }
    
}
