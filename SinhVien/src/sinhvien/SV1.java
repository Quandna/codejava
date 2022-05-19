package sinhvien;
import java.util.*;
import java.io.*;

public class SV1 implements Comparable<SV1> {
    private String ma, ten,lop,email;
    public SV1(String ma,String ten,String lop,String email){
        this.ma = ma;
        this.ten = chuanHoa(ten);
        this.lop = lop;
        this.email = email;
    }
    
    private String chuanHoa(String s){
        StringBuilder kq = new StringBuilder();
        StringTokenizer st = new StringTokenizer(s);
        while(st.hasMoreTokens()){
            String tmp = st.nextToken();
            kq.append(Character.toUpperCase(tmp.charAt(0)));
            for(int i = 1;i < tmp.length();i++){
                kq.append(Character.toLowerCase(tmp.charAt(i)));
            }
            kq.append(" ");
        }
        return kq.toString();
    }
    
    @Override
public int compareTo(SV1 o){
        if(this.ma.compareTo(o.ma) < 0) return -1;
        if(this.ma.compareTo(o.ma) > 0) return 1;
        return 0;
        
    }
    
    @Override
    public String toString(){
        return ma+" "+ten+" "+lop+" "+email;
                
    }
    
}
