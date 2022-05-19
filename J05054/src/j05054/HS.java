package j05054;
import java.util.*;
public class HS {
    private String ten,ma,xeploai;
    private float diemtb;
    
    public HS(int n,String ten,float diemtb){
        this.ma = "HS"+String.format("%02d", n);
        this.ten= ten;
        this.diemtb=diemtb;
        this.xeploai=XepLoai(diemtb);
    }
    private String XepLoai(float dtb){
        if(dtb<5.0) return "Yeu";
        else if(dtb>=5.0&&dtb<7.0) return "Trung Binh";
        else if(dtb>=7&&dtb<9.0) return "Kha";
        else return "Gioi";
    }
    public float getDtb(){
        return diemtb;
    }
    public String toString(){
        return ma+" "+ten+" "+(float)Math.round(diemtb*10)/10+" "+xeploai;
    }
    
}
