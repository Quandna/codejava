package j07050;
import java.util.*;
import java.io.*;
class MatHang implements Comparable<MatHang>{
    private String ten,loai,ma;
    private float giamua,giaban,lai;
    public MatHang(int n,String ten,String loai,float giamua,float giaban){
        this.ma = "MH"+String.format("%02d", n);
        this.ten = ten;
        this.loai = loai;
        this.giamua = giamua;
        this.giaban = giaban;
        this.lai = giaban - giamua;
    }
    @Override
    public int compareTo(MatHang o){
        if(this.lai == o.lai) return 0;
        else return (this.lai>o.lai) ?-1:1;
    }
    @Override
    public String toString(){
        return ma+" "+ten+" "+loai+" "+String.format("%.2f", lai);
    }
}
