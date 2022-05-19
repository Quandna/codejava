import java.util.*;
import java.text.*;
public class ThuNhapGiaoVien {
    private String ma,name;
    private long lcb, pc,tn;
    private int cap;
   
    public ThuNhapGiaoVien(String ma, String name, long lcb){
        this.ma = ma;
        this.name = name;
        this.lcb = lcb;
        this.cap = Cap(ma);
        this.pc = Pc(ma);
        this.tn = this.lcb*this.cap+this.pc;
    }
    
    
    public String toString(){
        return ma+" "+name+" "+cap+" "+ pc+" "+ tn;
    }
    private int Cap(String ma){
        String s="";
        s+=ma.substring(2);
        int t = Integer.parseInt(s);
        return t;
    }
    
    private long Pc(String ma){
        String s="";
        s+=ma.substring(0,2);
        
        if(s.compareTo("HT") == 0) return 2000000;
        else if(s.compareTo("HP" )== 0) return 900000;
        else return 500000;
    }
}
