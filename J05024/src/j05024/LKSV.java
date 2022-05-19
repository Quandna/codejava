package j05024;
import java.util.*;
public class LKSV {
    private String ma,ten,lop,email;
    public LKSV(String ma,String ten,String lop,String email){
        this.ma=ma;
        this.ten=ten;
        this.lop=lop;
        this.email=email;
    }
    
    public String getNganh(){       
        return ma; 
    }
    
    public String getLop(){
        String l = lop;
        String ktra = l.substring(0,1);
        return ktra;
    }
    
    @Override
    public String toString(){
        return ma+" "+ten+" "+lop+" "+email;
    }
}
