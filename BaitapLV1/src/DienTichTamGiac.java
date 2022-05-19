
package J04009;
import java.util.*;
import java.text.*;

public class DienTichTamGiac {
    private double x,y;
    public DienTichTamGiac(){
    
}

    public DienTichTamGiac(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public DienTichTamGiac(DienTichTamGiac p){
        this.x = p.x;
        this.y = p.y;
    }
    
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(DienTichTamGiac p){
        double d;
        d = Math.sqrt(Math.pow(this.x-p.x, 2)+Math.pow(this.y-p.y, 2));
        return d;
    }
    
    public  static double distance(DienTichTamGiac p1, DienTichTamGiac p2){
        double kq;
        kq = Math.sqrt(Math.pow(p1.x-p2.x, 2)+Math.pow(p1.y-p2.y, 2));
        return kq;
    }
    
    
    
    
    @Override
    public String toString() {
        return this.getX()+" "+this.getY();
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            DienTichTamGiac p1 = new DienTichTamGiac(sc.nextDouble(),sc.nextDouble());
            DienTichTamGiac p2 = new DienTichTamGiac(sc.nextDouble(),sc.nextDouble());
            DienTichTamGiac p3 = new DienTichTamGiac(sc.nextDouble(),sc.nextDouble());
            double a,b,c;
                     a = distance(p1,p2);
                     b = distance(p1,p3);
                     c = distance(p2,p3);
            DecimalFormat df = new DecimalFormat("0.00");
            double s;
            s = Math.sqrt((a+b+c)*(a+b-c)*(a-b+c)*(-a+b+c))*0.25;
            if(a+b<=c || a+c <= b||b+c<=a){
                System.out.println("INVALID");
            } else { 
                System.out.println(df.format(s));
            }
        }
    }
}
