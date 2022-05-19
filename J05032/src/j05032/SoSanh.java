package j05032;
import java.util.*;
import java.text.*;
public class SoSanh implements Comparable<SoSanh>{
    private String ten;
    private Date ns;
    public SoSanh(String ten,String ns) throws ParseException{
        this.ten = ten;
        this.ns = new SimpleDateFormat("dd/MM/yyyy").parse(ns);
    }
    
    @Override
    public int compareTo(SoSanh o){
        if(this.ns.after(o.ns)) return -1;
        else if(this.ns.before(o.ns)) return 1;
        return 0;
    }
    
    
    @Override
    public String toString(){
        return ten;
    }
}
