import java.util.*;
import java.text.*;
import java.io.*;
public class Vdsinhvien implements Serializable {
    private  String ma,hoten,lop;
    private Date ns;
    private float gpa;
    
    public Vdsinhvien(int id,String hoten,String lop,String ns,float gpa) throws ParseException{
            this.ma="B20DCCN" + String.format("%03d",id);
            this.hoten=hoten;
            this.lop=lop;
            this.ns=new SimpleDateFormat("dd/mm/yyyy").parse(ns);
            this.gpa=gpa;
    }
    public String toString(){
      return ma + " " + hoten + " " + lop+ " " + new SimpleDateFormat("dd/mm/yyyy").format(ns)+ " " + String.format("%.2f", gpa);
        
    }
}