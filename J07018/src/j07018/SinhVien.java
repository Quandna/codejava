package j07018;
import java.text.*;
import java.io.*;
import java.util.*;
public class SinhVien {
    private String nameSv,maSv,classSv;
    private Date nsSv;
    private float GPA;
    
    public SinhVien(int n,String nameSv,String classSv,String nsSv,float GPA) throws ParseException{
        this.maSv = "B20DCCN"+String.format("%03d", n);
        this.nameSv  =chuanHoa(nameSv);
        this.classSv = classSv;
        this.nsSv = new SimpleDateFormat("dd/MM/yyyy").parse(nsSv);
        this.GPA= GPA;
    }
    
    private String chuanHoa(String s){
        StringBuilder name = new StringBuilder();
        StringTokenizer st = new StringTokenizer(s);
        while(st.hasMoreTokens()){
            String tmp = st.nextToken();
            name.append(Character.toUpperCase(tmp.charAt(0)));
            for(int i = 1 ;i<tmp.length();i++){
                name.append(Character.toLowerCase(tmp.charAt(i)));
            }
            name.append(" ");
        }
        return name.toString();
    }

    @Override
    public String toString() {
        return maSv+" "+nameSv+" "+classSv+" "+new SimpleDateFormat("dd/MM/yyyy").format(nsSv)+" "+String.format("%.2f", GPA);
    }
    
    
    
}
