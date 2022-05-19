import java.util.*;

public class PhansoOOP{
    private long tu;
    private long mau;
    public PhansoOOP(long tu,long mau){
            this.tu = tu;
            this.mau=mau;
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
    
    public String toString() {
        return tu + "/" +mau;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhansoOOP ps = new PhansoOOP(sc.nextLong(),sc.nextLong());
        ps.rutGon();
        System.out.println(ps);
    }
}


