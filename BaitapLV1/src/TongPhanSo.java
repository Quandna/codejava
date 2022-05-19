import java.util.*;
import java.text.*;
public class TongPhanSo {
    private long tu,mau;
    public TongPhanSo(long tu, long mau){
        this.tu = tu;
        this.mau = mau;
    }
    public long getTu() {
        return tu;
    }
    public void setTu(){
        this.tu = tu;
    }
    public long getMau() {
        return mau;
    }
    public void setMau(){
        this.mau = mau;
    }
    private long gcd(long a,long b){
        while(b > 0) {
            long t = a%b;
            a = b;
            b = t;
        }
        return a;
    }
    
    public void rutGon() {
        long x = gcd(tu,mau);
        tu = tu/x;
        mau = mau/x;
    }
    
    
    
    public void congPhanSo(TongPhanSo ps){
        long ts = this.getTu() * ps.getMau()  + ps.getTu() * this.getMau();      
        long ms = this.getMau() * ps.getMau();
        TongPhanSo pstong = new TongPhanSo(ts,ms);
         pstong.rutGon();
         System.out.println(pstong.tu+"/"+pstong.mau);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TongPhanSo ps1 = new TongPhanSo(sc.nextLong(),sc.nextLong());
        TongPhanSo ps2 = new TongPhanSo(sc.nextLong(),sc.nextLong());
        ps1.congPhanSo(ps2);

    }
}
