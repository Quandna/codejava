package j07053;
import java.util.*;
import java.text.*;
public class Tinh {
    private String name,ns,ma,xephang;
    private float th,lt,thuong ;
    private int tb,tuoi;
    //private Date day;
    public Tinh(int i,String name,String ns,float th,float lt){
        this.ma="PH"+String.format("%02d", i);
        this.name=ChuanHoa(name);
        this.ns = ns;
        //this.day = new SimpleDateFormat("dd/MM/yyyy").parse(day);
        this.lt=lt;
        this.th=th;
        this.thuong=Thuong(th,lt);
        this.tb=Tb((th+lt)/2 + thuong);
        this.tuoi=Tuoi(ns);
        this.xephang=Xephang(tb);
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
    
    private float Thuong(float x,float y){
        if(x>=8&&y>=8) return (float)1.0;
        else if(x<7.5||y<7.5) return 0;
        else return (float) 0.5;
    }
    private int Tuoi(String ns){
        int len = ns.length();
        int dau = len-4;
        String s=ns.substring(dau);
        int t=Integer.parseInt(s);
        return 2021-t;
    }
    public String toString(){
        return ma+" "+name+" "+tuoi+" "+tb+" "+xephang;
    }
    private String Xephang(int tb){
        if(tb<5) return "Truot";
        if(tb>=5&&tb<=6) return "Trung binh";
        else if(tb>=7&&tb<8) return "Kha";
        else if(tb>=8&&tb<9) return "Gioi";
        else return "Xuat sac";
    }
    private int Tb(float x){
        if(x<10) return (int)Math.round(x);
        else return (int)10;
    }
}
