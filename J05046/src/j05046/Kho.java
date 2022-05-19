
package j05046;
import java.util.*;
class Kho {
    private String ten,ma;
    private int sl,dongia,tck,tt;
    public Kho(String ten,int sl,int dongia){
        this.ma=Ma(ten);
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
        return ten+" "+tck+" "+tt;
    }
    private String Ma(String ten){
        ten = ten.toUpperCase();
        String a [] = ten.split("\\s");
        StringBuilder tmp = new StringBuilder();
        for(int i = 0;i<2;i++){
            tmp.append(a[i].charAt(0));
        }
        return tmp.toString();
    }
    
    private int Tck(int sl,int dg){
        if(sl>10) return sl*dg*1/20;
        else if(sl>=8&&sl<=10) return sl*dg*1/50;
        else if(sl>=5&&sl<8) return sl*dg*1/100;
        else return 0;
    }
    
}
