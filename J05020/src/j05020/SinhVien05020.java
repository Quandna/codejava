
package j05020;

import java.util.*;

public class SinhVien05020 implements Comparable<SinhVien05020>{
    private String masv,ten,lop,email;
    public SinhVien05020(String masv,String ten,String lop,String email){
        this.masv=masv;
        this.ten= ten;
        this.lop= lop;
        this.email=email;
        
    }

    @Override
    public String toString(){
        return masv+" "+ten+" "+lop+" "+email;
    }
    @Override
    public int compareTo(SinhVien05020 o){
        if(this.lop.compareTo(o.lop) == 0){
            if(this.masv.compareTo(o.masv)>0) return 1;
            if(this.masv.compareTo(o.masv)<0) return -1;
            else return 0;
        }
        else if(this.lop.compareTo(o.lop)>0) return 1;
        else return -1;
        
        
    }   
    

}


