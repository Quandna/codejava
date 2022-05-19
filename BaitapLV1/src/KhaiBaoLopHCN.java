import java.util.*;
public class KhaiBaoLopHCN {
    private double width;
    private double height;
    private String color;
    
    public KhaiBaoLopHCN(){
        width = 1;
        height = 1;
    }
    
    public KhaiBaoLopHCN(double width, double height, String color){
        this.width = width;
        this.height = height;
        this.color = color;
    }
    
    public double getWidth(){
        return width;
    }
    
    public void setWidth(double width){
        this.width = width;
    }
    
    public double getHeight(){
        return height;
    }
    
    public void setHeight(double height){
        this.height = height;
    }
    
    public String getColor(){
        return color;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public double findArea(){
        return this.getHeight()*this.getWidth();
    }
    
    public double findPerimeter(){
        return (this.getHeight()+this.getWidth())*2;
    }
    
    public StringBuilder chuanHoa(){
        StringBuilder sb = new StringBuilder();
        String a = this.getColor();
        sb.append(Character.toUpperCase(a.charAt(0)));
           for(int i = 1;i<a.length();i++){
               sb.append(Character.toLowerCase(a.charAt(i)));
           } 
           return sb;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KhaiBaoLopHCN hcn = new KhaiBaoLopHCN();
        
        hcn.setHeight(Double.parseDouble(sc.next()));
        hcn.setWidth(Double.parseDouble(sc.next()));
        hcn.setColor(sc.next());
        if(hcn.getHeight() <= 0 || hcn.getWidth() <= 0){
            System.out.println("INVALID");
        } else {
            
          
            System.out.println((int)hcn.findPerimeter()+" "+(int)hcn.findArea()+" "+hcn.chuanHoa());
        }
    }
    
}
