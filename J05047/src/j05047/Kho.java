package j05047;

import java.util.*;
class Kho implements Comparable<Kho>{
    private String ten,ma;
    private int sl,dongia,tck,tt;
    public Kho(String ten,String ma,int sl,int dongia,int n){
        this.ma=ma+String.format("%02d", n);
        this.ten = ten;
        this.sl=sl;
        this.dongia=dongia;
        this.tck=Tck(sl,dongia);
        this.tt = dongia*sl-tck;
    }
    
    public String getMa(){
        return ma;
    }
    
    public String toString(){
        return ma+" "+ten+" "+tck+" "+tt;
    }
    
    private int Tck(int sl,int dg){
        if(sl>10) return sl*dg*1/20;
        else if(sl>=8&&sl<=10) return sl*dg*1/50;
        else if(sl>=5&&sl<8) return sl*dg*1/100;
        else return 0;
    }
    
    @Override
    public int compareTo(Kho o){
        if(this.tck>o.tck) return -1;
        else if(this.tck<o.tck) return 1;
        else return 0;
    }
    
}
