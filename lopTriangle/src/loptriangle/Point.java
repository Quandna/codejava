package loptriangle;
import java.util.Scanner;

    public class Point {
    private float x,y;
    public Point(float x,float y){
        this.x=x;
        this.y=y;
    }

    public static Point nextPoint(Scanner sc){
        return new Point(sc.nextFloat(),sc.nextFloat());
    }
    
    public float getX(){
        return x;
    }
    public float getY(){
        return y;
    }
    
}

