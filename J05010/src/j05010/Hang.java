package j05010;
import java.util.*;
class Hang implements Comparable<Hang>{
    private String ten,loai;
    private int ma;
    private double giamua,giaban,loinhuan;
    public Hang(int ma,String ten,String loai,double giamua,double giaban){
        this.ma = ma;
        this.ten = ten;
        this.loai = loai;
        this.giamua = giamua;
        this.giaban = giaban;
        this.loinhuan = giaban - giamua;
        
    }
    
    @Override
    public int compareTo(Hang o ){
        if(this.loinhuan == o.loinhuan) return 0;
        else return (this.loinhuan>o.loinhuan) ?-1:1;
    }
    
    @Override
    public String toString(){
        return ma+" "+ten+" "+loai+" "+String.format("%.2f", loinhuan);
    }
    
}
