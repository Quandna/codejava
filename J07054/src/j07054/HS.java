package j07054;
import java.util.*;
public class HS implements Comparable<HS>{
    private String ten,ma;
    private float diemtb;
    private float t,l,h;
    
    public HS(int n,String ten,float t,float l,float h){
        this.ma = "SV"+String.format("%02d", n);
        this.ten= ChuanHoa(ten);
        this.t = t;
        this.l = l;
        this.h = h;
        this.diemtb=DiemTb();
        
    }
    
    private float DiemTb(){
        float tb = this.t*3+this.l*3+this.h*2;
        return (float)Math.round(tb/8*100)/100;
    }
    private String ChuanHoa(String s){
        StringBuilder kq = new StringBuilder();
        StringTokenizer st = new StringTokenizer(s.trim());
        while(st.hasMoreTokens()){
            String tmp = st.nextToken();
            kq.append(Character.toUpperCase(tmp.charAt(0)));
            for(int i = 1;i<tmp.length();i++){
                kq.append(Character.toLowerCase(tmp.charAt(i)));
            }
            kq.append(" ");
        }
        return kq.toString().trim();
    }
    
    public float getDtb(){
        return diemtb;
    }
    public String toString(){
        return ma+" "+ten+" "+String.format("%.2f", diemtb);
    }
    
    @Override
    public int compareTo(HS o){
        if(this.diemtb == o.diemtb){
            return (this.ma.compareTo(o.ma));
        }
        else return (this.diemtb>o.diemtb)?-1:1;
    }
    
}