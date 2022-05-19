import java.util.*;
import java.text.*;
public class ChuViTamGiac {
    private double x;
    private double y;
    
    public ChuViTamGiac(){
        
    }
    
    public ChuViTamGiac(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    public ChuViTamGiac(ChuViTamGiac p){
        this.x = p.x;
        this.y = p.y;
    }
    
    public double getX() {
        return x;
    }
    
    public double getY() {
        return y;
    }
    
    public double distance(ChuViTamGiac p){
        double d;
        d = Math.sqrt(Math.pow(this.x-p.x,2)+Math.pow(this.y-p.y,2));
        return d;
    }
    
    public static double distance(ChuViTamGiac p1,ChuViTamGiac p2){
        double kq;
        kq = Math.sqrt(Math.pow((p1.x - p2.x),2)+Math.pow((p1.y - p2.y),2));
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
            ChuViTamGiac p1 = new ChuViTamGiac(sc.nextDouble(),sc.nextDouble());
            ChuViTamGiac p2 = new ChuViTamGiac(sc.nextDouble(),sc.nextDouble());
            ChuViTamGiac p3 = new ChuViTamGiac(sc.nextDouble(),sc.nextDouble());
            double a,b,c;
            a = distance(p1,p2);
            b = distance(p2, p3);
            c = distance(p1, p3);
            DecimalFormat df = new DecimalFormat("0.000");
            if(a+b<=c || a+c <= b||b+c<=a){
                System.out.println("INVALID");
            } else
            {
                System.out.println(df.format(a+b+c));
            }
        }
    }
    
    }
    
  
    
    

