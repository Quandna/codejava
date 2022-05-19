package j05082;
import java.util.*;
import java.text.*;
public class KhachHang implements Comparable<KhachHang>{
    private String ma,ten ,gt,dchi;
    private Date ns;
    
    public KhachHang (int n,String ten,String gt,String ns,String dchi) throws ParseException{
        this.ma = "KH"+String.format("%03d", n);
        this.ten = ChuanHoa(ten);
        this.gt = gt;
        this.ns = new SimpleDateFormat("dd/MM/yyyy").parse(ns);
        this.dchi = dchi;
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
    
    @Override
    public int compareTo(KhachHang o){
        if(this.ns.compareTo(o.ns) == 0){
            return 0;
        }
        else return (this.ns.compareTo(o.ns) > 0) ?1:-1;
    }
    
    @Override
    public String toString(){
        return ma+" "+ten+" "+gt+" "+dchi.trim()+" "+new SimpleDateFormat("dd/MM/yyyy").format(ns);
    }
}
