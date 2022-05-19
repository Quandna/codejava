import java.util.*;
import java.text.DecimalFormat;
public class LopThiSinhOOP {
    private String name;
    private String day;
    private float mon1;
    private float mon2;
    private float mon3;
    
//   public LopThiSinhOOP(){
//           }
    
    public String getName() {
        return name;
        
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public String getDay() {
        return day;
    }
    public void setDay(String day) {
        this.day = day;
    }
    
    public float getMon1(){
        return mon1;
    }
    public void setMon1(float mon1){
        this.mon1 = mon1;
    }
    
    public float getMon2(){
        return mon2;
    }
    public void setMon2(float mon2){
        this.mon2 = mon2;
    }
    
    public float getMon3(){
        return mon3;
    }
    public void setMon3(float mon3){
        this.mon3 = mon3;
    }
    
    public float tong(){
        float sum = this.getMon1()+this.getMon2()+this.getMon3();
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LopThiSinhOOP lts = new LopThiSinhOOP();
        
        lts.setName(sc.nextLine());
        lts.setDay(sc.nextLine());
        lts.setMon1(sc.nextFloat());
        lts.setMon2(sc.nextFloat());
        lts.setMon3(sc.nextFloat());
        DecimalFormat d = new DecimalFormat("0.0");
        System.out.print(lts.getName()+" "+lts.getDay()+" "+d.format(lts.tong()));
    }
}
