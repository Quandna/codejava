/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
import java.util.*;
public class DienTichHinhTronNgt {
    private double x,y;

    public DienTichHinhTronNgt(){
        
    }
    
    public DienTichHinhTronNgt(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    public DienTichHinhTronNgt(DienTichHinhTronNgt a){
        a.x = this.x;
        a.y = this.y;
    }
    
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(DienTichHinhTronNgt b){
        return Math.sqrt((Math.pow(this.x - b.x,2))+(Math.pow(this.y - b.y,2)));
    }
    
    public double distance(DienTichHinhTronNgt p1, DienTichHinhTronNgt p2){
        return Math.sqrt((Math.pow(p1.x - p2.x, 2)) + (Math.pow(p1.y - p2.y, 2)));
    }

    @Override
    public String toString() {
        return this.x+" "+this.y;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            DienTichHinhTronNgt a = new DienTichHinhTronNgt(sc.nextDouble(),sc.nextDouble());
            DienTichHinhTronNgt b = new DienTichHinhTronNgt(sc.nextDouble(),sc.nextDouble());
            DienTichHinhTronNgt c = new DienTichHinhTronNgt(sc.nextDouble(),sc.nextDouble());
            
            double e1 = a.distance(b);
            double e2 = a.distance(c);
            double e3 = b.distance(c);
            
            	if (e1 + e2 > e3 && e1 + e3 > e2 && e3 + e2 > e1){
                Double S = Math.sqrt((e1+e2+e3)*(e1+e2-e3)*(e1-e2+e3)*(-e1+e2+e3)) /4;
                Double R = (e1*e2*e3)/(4*S);
				System.out.println(String.format("%.3f", Math.PI * Math.pow(R, 2)));
            }
            else System.out.println("INVALID");
            
        }
    }
}
