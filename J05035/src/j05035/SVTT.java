
package j05035;
import java.util.*;
class SVTT implements Comparable<SVTT>{
    private String ma,ten,lop,email,cty;
    private int stt;
    public SVTT(int n,String ma,String ten,String lop,String email,String cty){
        this.stt = n;
        this.ma=ma;
        this.ten=ten;
        this.lop = lop;
        this.email=email;
        this.cty = cty;
    }
    
    public String getCty(){
        return cty;
    }
    
    
    @Override
    public int compareTo(SVTT o){
        if(this.ma.compareTo(o.ma)>0) return 1;
        else if(this.ma.compareTo(o.ma)<0) return -1;
        else return 0;
    }
    
    @Override
    public String toString(){
        return stt+" "+ma+" "+ten+" "+lop+" "+email+" "+cty;
    }
}
