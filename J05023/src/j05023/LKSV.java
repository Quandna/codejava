package j05023;
import java.util.*;
public class LKSV {
    private String ma,ten,lop,email;
    public LKSV(String ma,String ten,String lop,String email){
        this.ma=ma;
        this.ten=ten;
        this.lop=lop;
        this.email=email;
    }
    
    public String getLop(){
        String s = lop;
        String nam =  s.substring(1,3);
        return nam;       
    }
    
    @Override
    public String toString(){
        return ma+" "+ten+" "+lop+" "+email;
    }
}
