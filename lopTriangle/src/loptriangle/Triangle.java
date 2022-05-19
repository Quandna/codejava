package loptriangle;
import java.util.*;
import java.awt.Point;
public class Triangle {
    
    private Point a,b,c;
    
    
    
    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public float tinh(float x1,float x2,float y1,float y2){
        return (float ) Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
    }

    
    public boolean valid(){
        float ab= tinh(a.getX(),b.getX(),a.getY(),b.getY());
        float ac= tinh(a.getX(),c.getX(),a.getY(),c.getY());
        float bc= tinh(b.getX(),c.getX(),b.getY(),c.getY());
        if(ab+ac>bc&&ab+bc>ac&&bc+ac>ab) return true ;
        return false;
    }

    public String getPerimeter(){
        float ab= tinh(a.getX(),b.getX(),a.getY(),b.getY());
        float ac= tinh(a.getX(),c.getX(),a.getY(),c.getY());
        float bc= tinh(b.getX(),c.getX(),b.getY(),c.getY());
        return String.format("%.3f", ab+ac+bc);
    }
}
