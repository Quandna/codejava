package j05027;
import java.util.*;
public class GiangVien {
    private String ten,khoa,ma;
    public GiangVien(int n,String ten,String khoa){
        this.ma = "GV"+String.format("%02d", n);
        this.ten = ten;
        this.khoa = rutGon(khoa);
    }
    
    private String rutGon(String s){
        StringBuilder kq = new StringBuilder();
        StringTokenizer st = new StringTokenizer(s);
        while(st.hasMoreTokens()){
            String tmp = st.nextToken();
            kq.append(Character.toUpperCase(tmp.charAt(0)));
        }
        return kq.toString();
    }
    
    public String GetTen(){
        return ten;
    }
    
    @Override
    public String toString(){
        return ma+" "+ten+" "+khoa;
    }
}
