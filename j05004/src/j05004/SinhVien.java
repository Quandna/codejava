package j05004;
import java.text.*;
import java.util.*;
public class SinhVien {
    private String code,name,Class;
    private Date dateOB;
    private float gpa;
    
    public SinhVien(int n, String name, String Class, String dateOB, float gpa) throws ParseException{
        this.code = "B20DCCN"+ String.format("%03d", n);
        this.name = chuanHoa(name);
        this.Class = Class;
        this.dateOB =new SimpleDateFormat("dd/MM/yyyy").parse(dateOB);
        this.gpa = gpa;
        
    }
    
    private  String chuanHoa(String s) {
        StringBuilder kq = new StringBuilder();
        StringTokenizer st  =   new StringTokenizer(s);
        while(st.hasMoreTokens()) {
            String tmp = st.nextToken();
            kq.append(Character.toUpperCase(tmp.charAt(0)));
                for(int i = 1 ;i < tmp.length();i++) {
                    kq.append(Character.toLowerCase(tmp.charAt(i)));
                }
                kq.append(" ");
        }
        return kq.toString().trim();
    }
    
     public String toString(){
        return code + " " + name + " " + Class + " " + new SimpleDateFormat("dd/MM/yyyy").format(dateOB) + " " + String.format("%.2f", gpa);
    }
}
