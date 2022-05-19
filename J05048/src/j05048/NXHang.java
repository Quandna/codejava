package j05048;
import java.util.*;
import java.text.*;
public class NXHang {
    private String name;
    private  long tien,thue;
    private int dg,nhap;
     private int xuat;
    public NXHang(String name,int nhap){
        this.name=name;
        this.nhap=nhap;
        this.xuat=Xuat(nhap,name);
        this.dg=Dg(name);
        this.tien=(int)this.xuat*this.dg;
        this.thue=Thue(name,tien);
    }
    @Override
    public String toString(){
        return name+" "+nhap+" "+xuat+" "+dg+" "+tien+" "+thue;
    }
    private int Xuat(int nhap,String s){
        if(s.charAt(0)=='A') {
           int n=Math.round((float)(nhap*60)/100);
              return  n;
        }
        else {
          int m=Math.round((float)(nhap*70)/100);
              return  m;
        }
    }
    private int Dg(String s ){
        if(s.charAt(s.length()-1)=='Y') return 110000;
        else return 135000;
    }
    private long Thue(String s,long tien){
        if(s.charAt(0)=='A'&&s.charAt(s.length()-1)=='Y') return tien*8/100;
        if(s.charAt(0)=='A'&&s.charAt(s.length()-1)=='N') return tien*11/100;
        if(s.charAt(0)=='B'&&s.charAt(s.length()-1)=='Y') return tien*17/100;
       else return tien*22/100;
    }
}
