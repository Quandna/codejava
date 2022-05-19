package j07033;
import java.util.*;
import java.io.*;
class SinhVien implements Comparable<SinhVien>{
    private String ma,ten,lop,email;
    public SinhVien(String ma,String ten,String lop,String email){
        this.ma = ma;
        this.ten =ChuanHoa(ten);
        this.lop = lop;
        this.email = email;
    }
    private String ChuanHoa(String s){
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
        return kq.toString().trim();
    }
    
    public String toString(){
        return ma+" "+ten+" "+lop+" "+email;
    }
    
    @Override
    public int compareTo(SinhVien o){
        return (this.ma.compareTo(o.ma));
    }
}
