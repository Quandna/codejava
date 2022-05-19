package ttp24.pkg11;
import java.util.*;
import java.text.*;
public class Tinh implements Comparable<Tinh>{
    private String ten,ma,phong;
    private Date den,di;
    private long ngay;
    private long ps,tong,gia;
    public Tinh(int i,String ten,String phong,String den,String di,long ps) throws ParseException{
        this.ma = "KH"+String.format("%02d", i);
        this.ten = ChuanHoa(ten);
        this.phong= phong;
        this.ps = ps;
        this.den = new SimpleDateFormat("dd/MM/yyyy").parse(den);
        this.di = new SimpleDateFormat("dd/MM/yyyy").parse(di);        
        this.ngay =  TinhNgay();
        this.gia = Gia();
        this.tong = (long) gia*ngay+ps;
    }
    
    private long TinhNgay(){
        long sn ;
        sn = (long) (this.di.getTime() - this.den.getTime())/(24*60*60*1000);
        if(sn < 1) return 1;
        else return sn+1;
    }
    
    private long Gia(){
        Character tmp = this.phong.charAt(0);
        if(tmp == '1') return 25;
        else if(tmp == '2') return 34;
        else if(tmp == '3') return 50;
        else return 80;
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
     
     @Override
     public int compareTo(Tinh o){
         if(this.tong == o.tong) return 0;
         else return (this.tong>o.tong) ?-1:1;
     }
     
     @Override
     public String toString(){
         return ma+" "+ten+" "+phong+" "+ngay+" "+tong;
     }
     
}
