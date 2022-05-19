package j07037;
import java.io.*;
/**
 *
 * @author ADMIN
 */
class DN implements Comparable<DN>{
    private String ma,ten;
    private int sv;
    public DN (String ma,String ten,int sv){
        this.ma = ma;
        this.ten = ten;
        this.sv =sv;
    }
    
    @Override
    public String toString(){
        return ma+" "+ten+" "+sv;
    }
    
    @Override
    public int compareTo(DN o){
        return (this.ma.compareTo(o.ma));
    }
}
