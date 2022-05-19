package qlks1711;
import java.util.*;

public class Phong implements Comparable<Phong>{
    private String kyhieu,ten;
    private long dongia;
    private double phiphucvu;
    public Phong(String s){
        s = s.trim();
        String[] kq = s.split("\\s+");
        this.kyhieu = kq[0];
        this.ten = kq[1];
        this.dongia = Integer.parseInt(kq[2]);
        this.phiphucvu = Double.parseDouble(kq[3]);
    }

    public boolean check(String s){
        if(s.equals(kyhieu)) return true;
        else return false;
    }

    public long getGia(){
        return dongia;
    }
    public double getPPV(){
        return phiphucvu;
    }

    @Override
    public int compareTo(Phong o){
        return this.ten.compareTo(o.ten);
    }

//    @Override
//    public String toString(){
//        return kyhieu+" "+ten+" "+dongia+" "+phiphucvu;
//    }
   

    

    
}
