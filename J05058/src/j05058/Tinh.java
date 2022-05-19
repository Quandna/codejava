package j05058;
import java.util.*;
public class Tinh implements Comparable<Tinh>{
    private String ma,name,kq;
    private double toan ,ly,hoa;
    private double diem,diemchuan,uutien;

    public Tinh(String ma, String name, double toan, double ly,double hoa) {
        this.ma = ma;
        this.name = name;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
        this.uutien = (double) Uutien(ma);
        this.diem = (double) (this.toan*2+this.ly+this.hoa+uutien);
        this.kq = KetQua(diem);
        
    }
    
    private double Uutien(String s){        
        String ma = "";
        ma += s.substring(0,3);
        if(ma.compareTo("KV1") == 0) return 0.5;
        else if(ma.compareTo("KV2") == 0) return 1;
        else return 2.5;
    }
    
    private String KetQua(double diem){
        if((diem) >= 24) return "TRUNG TUYEN";
        else return "TRUOT";
    }
    
    private String chuan(double x){
        String s="";
        if(x==(int)x){
            s+=(int)x;         
        }
        else  s+=(double)x;
        return s;
    }

    @Override
    public int compareTo(Tinh o){
        if(this.diem == o.diem){
            return 0;
        } else return (this.diem > o.diem) ?-1:1;
    }
    
    
    @Override
    public String toString() {
        return ma+" "+name+" "+chuan(uutien)+" "+chuan(diem)+" "+kq;
    } 
}

