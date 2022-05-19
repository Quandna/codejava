
package monhocktra;
import java.util.*;
import java.io.*;

public class MONHOC implements Comparable<MONHOC> {

   private String ma, ten;
   private int stc;
   public MONHOC(String ma, String ten,int stc){
    this.ma = ma;
    this.ten = ten;
    this.stc = stc;
}
    @Override
    public String toString(){
        return ma+" "+ten+" "+stc;
    }
    
    @Override
    public int compareTo(MONHOC o){
        if(this.ten.compareTo(o.ten)<0) return -1;
        if(this.ten.compareTo(o.ten)>0) return 1;
        return 0;
    }
}
