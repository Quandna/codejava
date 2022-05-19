
package dsmonhoc;
import java.util.*;
import java.io.*;
import java.text.ParseException;

public class MonHoc implements Comparable<MonHoc>{
    private String ma,ten;
    private int stc;
    public MonHoc(String ma,String ten,int stc)   {
        this.ma = ma;
        this.ten = ten;
        this.stc = stc;
    }
    
    
    @Override
    public int compareTo(MonHoc o){
        if(this.ten.compareTo(o.ten)<0) return -1;
         if(this.ten.compareTo(o.ten)>0) return 1;
        return 0;
    }
   
    
    @Override
    public String toString(){
        return ma+" "+ten+" "+stc;
    }
    
    
}
