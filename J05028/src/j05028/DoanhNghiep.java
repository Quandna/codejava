package j05028;
import java.util.*;
public class DoanhNghiep implements Comparable<DoanhNghiep>{
    private String ma,ten;
    private long sv;
    public DoanhNghiep(String ma,String ten,long sv){
        this.ma = ma;
        this.ten = ten;
        this.sv =sv;
    }
    
    @Override
    public int compareTo(DoanhNghiep o){
        if(this.sv==o.sv){
            if(this.ma.compareTo(o.ma)==0){
                return 0;
            }else return (this.ma.compareTo(o.ma)>0) ?1:-1;
        }
        else return (this.sv > o.sv) ?-1:1;
    }
    
    @Override
    public String toString(){
        return ma+" "+ten+" "+sv;
    }
}
