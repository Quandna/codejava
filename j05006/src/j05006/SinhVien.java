package j05006;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class SinhVien {
    private String ma,name,gtinh,diachi,masothue;
    private Date ns,nkhd;
    
    public SinhVien(int i,String name,String gtinh,String ns,String diachi,String masothue,String nkhd) throws ParseException{
        this.ma = String.format("%05d", i);
        this.name = chuanHoa(name);
        this.gtinh = gtinh;
        this.ns = new SimpleDateFormat("dd/MM/yyyy").parse(ns);
        this.diachi = diachi;
        this.masothue = masothue;
        this.nkhd = new SimpleDateFormat("dd/MM/yyyy").parse(nkhd);
        
    }

    private String chuanHoa(String a) {
        StringBuilder s = new StringBuilder();
        StringTokenizer m = new StringTokenizer(a);
        while(m.hasMoreTokens()){
            String p = m.nextToken();
            s.append(Character.toUpperCase(p.charAt(0)));
            for(int i = 1;i <p.length();i++){
                s.append(Character.toLowerCase(p.charAt(i)));
            }
            s.append(" ");
        }
        return s.toString();
    }

    @Override
    public String toString() {
        return ma+" "+name+" "+gtinh+" "+new SimpleDateFormat("dd/MM/yyyy").format(ns)+" "+diachi+" "+masothue+" "+new SimpleDateFormat("dd/MM/yyyy").format(nkhd);
    }
    
}
