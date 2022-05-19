package j05018;

import java.util.*;
import java.text.*;
public class BangDiem implements Comparable<BangDiem>{
    private String ten,ma,xeploai;
    private float tb;
    
    public BangDiem(int n,String ten,String gpa){
        this.ma = "HS"+String.format("%02d", n);
        this.ten = ten;
        this.tb=Tb(gpa);
        this.xeploai = xepHang(this.tb);
    }
    
    private String xepHang(float tb){
        if(tb>=9) return "XUAT SAC";
        if(tb>=8 && tb<=8.9) return "GIOI";
        if(tb>=7 && tb <= 7.9) return "KHA";
        if(tb>=5 && tb <= 6.9) return "TB";
        return "YEU";
    }
    
    private float Tb(String a){
        StringBuilder s = new StringBuilder();
        StringTokenizer st = new StringTokenizer(a);
        float n =0;
        for(int i = 1;i<=10;i++){
            float t = Float.parseFloat(st.nextToken());
            if(i == 1 || i == 2){
                n+=t*2;
            } else {
                n+=t;
            }
        }
        return (float)Math.round((n/12)*10)/10;
    }
    
    @Override
    public String toString(){
        return ma+" "+ten+" "+String.format("%.1f", tb)+" "+xepHang(tb);
                
    }
    
    @Override
    public int compareTo(BangDiem o){
        if(this.tb<o.tb) return 1;
        else if(this.tb>o.tb) return -1;
        else return 0;
    }
    
    
}
