
package j05025;
import java.util.*;

public class GiangVien implements Comparable<GiangVien>{
    private String hoten,ten,maGv,maKhoa;
    
    public GiangVien(int n,String hoten,String maKhoa){
        this.maGv = "GV"+String.format("%02d", n);
        this.hoten = hoten;
        this.ten = lastTen(hoten);
        this.maKhoa = VietTat(maKhoa);
        
    }
    
    private String VietTat(String s){
        StringBuilder kq = new StringBuilder();
        StringTokenizer st = new StringTokenizer(s);
        while(st.hasMoreTokens()){
            String tmp = st.nextToken();
            kq.append(Character.toUpperCase(tmp.charAt(0)));
        }
        return kq.toString();
    }
    
    private String lastTen(String s){
        StringBuilder kq = new StringBuilder();
        StringTokenizer st = new StringTokenizer(s);
        while(st.hasMoreTokens()){
            String tmp = st.nextToken();
            if(st.countTokens() == 0){
                kq.append(tmp);
            }
        }
        return kq.toString();
    }
    
    @Override
    public int compareTo(GiangVien o){
        if(this.ten.compareTo(o.ten) == 0){
            return this.maKhoa.compareTo(o.maKhoa);
        }
        return this.ten.compareTo(o.ten);
    }
     
    @Override
    public String toString(){
        return maGv+" "+hoten+" "+maKhoa;
    }
    
}
