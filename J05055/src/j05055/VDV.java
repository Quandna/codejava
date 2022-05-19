package j05055;
import java.util.*;
import java.text.*;
class VDV {
    private String name,ma,thoigian;
    private Date ns,xp,vd;
    public VDV(int n,String name,String ns,String xp,String vd) throws ParseException{
        this.ma = "VDV"+String.format("%02d", n);
        this.name = name;        
        this.ns = new SimpleDateFormat("dd/MM/yyyy").parse(ns);
        this.xp = new SimpleDateFormat("HH:mm:ss").parse(xp);
        this.vd = new SimpleDateFormat("HH:mm:ss").parse(vd);
        this.thoigian = TinhTg(this.xp, this.vd);
    }
    
    private String TinhTg(Date g1,Date g2){
        long diff = g2.getTime()-g1.getTime();
        long giay = diff/1000;
        long phut = diff/(60*1000);
        long gio = diff/(60*60*1000);
        return (gio+":"+phut+":"+giay);
    }
    public String getTg(){
        return thoigian;
    }
    
    public String toString(){
        return ma+" "+name+" "+xp+" "+vd+" "+thoigian;
    }
}
