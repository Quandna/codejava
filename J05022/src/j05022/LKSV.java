package j05022;
import java.util.*;
public class LKSV {
    private String ma,ten,email;
    public String lop;
    
    public LKSV(String ma,String ten,String lop,String email){
        this.ma=ma;
        this.ten=ten;
        this.lop=lop;
        this.email=email;
    }
    
//    public String getLop(){
//        return lop;
//    }
    
    @Override
    public String toString(){
        return ma+" "+ten+" "+lop+" "+email;
    }
}
