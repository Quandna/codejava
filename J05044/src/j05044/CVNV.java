package j05044;
import java.util.*;
import java.text.*;
public class CVNV {
    private String ten,chucvu,ma;
    private long lcb,snc,phucap,tamung,conlai,luongChinh;
    public CVNV(int n,String ten,String chucvu,long lcb,long snc){
        this.ten = ten;
        this.chucvu=chucvu;
        this.ma = "NV"+String.format("%02d", n);
        this.lcb = lcb;
        this.snc = snc;
        this.luongChinh = lcb*snc+PhuCap(chucvu);
        this.phucap = PhuCap(chucvu);
        this.tamung =TamUng(chucvu,lcb,snc);
        this.conlai = luongChinh - tamung;
    }
    
    private long PhuCap(String chucvu){
        if(chucvu.compareTo("GD") == 0) return 500;
        else if(chucvu.compareTo("PGD")==0) return 400;
        else if(chucvu.compareTo("TP")==0) return 300;
        else if(chucvu.compareTo("KT")==0) return 250;
        else return 100;
    }
    
    private long TamUng(String chucvu ,long lcb,long snc){
        double n = (PhuCap(chucvu)+lcb*snc)*2/3;
        if(n < (double) 25000){
            return(long) Math.round(n/1000)*1000;
        }else {
            return 25000;
        }    
    }
    
    public String getCv(){
        return chucvu;
    }
    
    @Override
    public String toString(){
        return ma+" "+ten+" "+phucap+" "+(lcb*snc)+" "+(tamung)+" "+conlai;
    }
}