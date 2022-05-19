package j05029;
import java.util.*;
public class DoanhNghiep implements Comparable<DoanhNghiep>{
    private String ma,ten;
    private int sv;
    public DoanhNghiep(String ma,String ten,int sv){
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
    
    public int getIndex(){
        return sv;
    }
    
    @Override
    public String toString(){
        return ma+" "+ten+" "+sv;
    }
}

