package dssp1711;
import java.util.*;

class SanPham implements Comparable<SanPham>{
    private String ma,ten;
    private long gia,bh;
    public SanPham(String ma,String ten,long gia,long bh){
        this.ma=ma;
        this.ten=ten;
        this.gia=gia;
        this.bh=bh;
    }
    @Override
    public int compareTo(SanPham o){
        if(this.gia==o.gia){
            return (this.ma.compareTo(o.ma));
        } else return (this.gia>o.gia) ?-1:1;
    }
    
    @Override
    public String toString(){
        return ma+" "+ten+" "+gia+" "+bh;
    }
}
