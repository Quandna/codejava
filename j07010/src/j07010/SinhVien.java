package j07010;
import java.io.IOException;
import java.util.*;
import java.text.*;
public class SinhVien {
    private String name,sClass,ma;
    private Date ns;
    private Float gpa;
    public SinhVien(int n,String name,String sClass,String ns,Float gpa) throws ParseException{
        this.ma = "B20DCCN"+String.format("%03d", n);
        this.name = chuanHoa(name);
        this.sClass = sClass;
        this.ns =new SimpleDateFormat("dd/MM/yyy").parse(ns);
        this.gpa = gpa;
    }
    
    private String chuanHoa(String s){
        StringBuilder name = new StringBuilder();
        StringTokenizer st = new StringTokenizer(s);
        while(st.hasMoreElements()){
            String tmp = st.nextToken();
            
            name.append(Character.toUpperCase(tmp.charAt(0)));
            for(int i = 1;i<tmp.length();i++){
                name.append(Character.toLowerCase(tmp.charAt(i)));
                
            }
            name.append(" ");
        }
        return name.toString().trim();
    }

    @Override
    public String toString() {
        return ma + " " + name + " "+ sClass + " "+ new SimpleDateFormat("dd/MM/yyyy").format(ns)+ " " + String.format("%.2f",gpa);
    }
    
    
}
