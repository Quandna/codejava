import java.util.*;
import java.text.*;
public class KhaiBaoLopPOINT {
    private double xA,yA;
    private double xB,yB;
    public KhaiBaoLopPOINT(){
        
    }
    
    public KhaiBaoLopPOINT(double xA, double yA,double xB,double yB){
        this.xA = xA;
        this.yA = yA;
        this.xB = xB;
        this.yB = yB;
    }
    
    public KhaiBaoLopPOINT(KhaiBaoLopPOINT p){
        p.xA = xA;
        p.yB= yB;
        p.xB=xB;
        p.yB = yB;
    }
    
    public double getXA(){
        return xA;
    }
    public double getXB(){
        return xB;
    }
    public double getYA(){
        return yA;
    }
    public double getYB(){
        return yB;
    }
    public double distance(){
        double dodaiAB = Math.sqrt(Math.pow((xB - xA), 2) + Math.pow((yB - yA), 2));
        return dodaiAB;
    }
       
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            KhaiBaoLopPOINT p = new KhaiBaoLopPOINT(sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
            
            DecimalFormat d = new DecimalFormat("0.0000");
            System.out.println(d.format(p.distance()));
        }
    }
    
}
