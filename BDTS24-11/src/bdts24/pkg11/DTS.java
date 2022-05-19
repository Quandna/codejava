package bdts24.pkg11;
import java.util.*;
public class DTS implements Comparable<DTS>{
    private String ten ,dt,ma,kq;
    private float diem,uutien,tong;
    private int kv;
    public DTS(int i,String ten,float diem,String dt,int kv){
        this.ma = "TS"+String.format("%02d", i);
        this.ten = ChuanHoa(ten);
        this.diem = diem;
        this.dt = dt;
        this.kv = kv;
        this.uutien = Ut(dt,kv);
        this.tong = (float) (diem+uutien);
        this.kq = Check(tong);       
    }

    private String ChuanHoa(String ten) {
        StringBuilder kq = new StringBuilder();
        StringTokenizer st = new StringTokenizer(ten);
        while(st.hasMoreTokens()){
            String tmp = st.nextToken();
            kq.append(Character.toUpperCase(tmp.charAt(0)));
            for(int j = 1;j<tmp.length();j++){
                kq.append(Character.toLowerCase(tmp.charAt(j)));
            }
            kq.append(" ");
        }
        return kq.toString().trim();
    }

    private float Ut(String dt, int kv) {
        if(dt.compareTo("Kinh") == 0){
            if(kv == 1) return (float) 1.5;
            else if(kv == 2) return (int) 1;
            else return 0;
        }
        else {
            if(kv == 1) return (int) 3;
            else if(kv == 2) return (float) 2.5;
            else return (float) 1.5;
        }
    }
    
    private String Check(float diem){
        if(diem >= 20.5) return "Do";
        else return "Truot";
    }
    
    @Override
    public int compareTo(DTS o){
        if(this.tong == o.tong){
            return (this.ma.compareTo(o.ma));
        } else return (this.tong>o.tong) ?-1:1;
    }
    
    @Override
    public String toString(){
        return ma+" "+ten+" "+tong+" "+kq;
    }
    
}
