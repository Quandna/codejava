package baitoantinhcong;
import java.util.*;
public class TinhCong1 {
     private String ma,name,cv;
    private long lcb,sn,lt,thuong,pc,tn;
    public TinhCong1(String name,long lcb,long sn,String cv){
        this.ma="NV01";
        this.name=name;
        this.lcb=lcb;
        this.sn=sn;
        this.cv=cv;
        this.lt=this.lcb*sn;
        this.thuong=Thuong(sn,lt);
        this.pc=Pc(cv);
        this.tn=this.lt+this.thuong+this.pc;
    }
    public String toString(){
        return ma+" "+name+" "+lt+" "+thuong+" "+pc+" "+tn; 
    }
    private long Thuong(long sn,long lt){
        if(sn>=25) return lt*20/100;
        else if(sn>=22&&sn<25) return lt*10/100;
        else return 0;
    }
    private long Pc(String pc){
        if(pc.compareTo("GD")==0) return 250000  ;
        else if(pc.compareTo("PGD")==0) return 200000;
        else if(pc.compareTo("TP")==0) return 180000;
        else return 150000;
    }
}
