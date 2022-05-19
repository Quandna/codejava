
import java.util.*;
import java.text.*;
public class KhaiBaoLopSv {
    private String id = "B20DCCN001";
    private String name,idclass,birthday;
    private float gpa;
    public KhaiBaoLopSv(String name, String idclass,String birthday,float gpa){
        this.name = name;
        this.idclass = idclass;
        this.birthday = birthday;
        this.gpa  = gpa;
    }
    
    public String getName(){
        return name;
    }
    
    public String getIdclass(){
        return idclass;
    }
    
    public String getbirthDay(){
        return birthday;
    }
    
    public float getGpa(){
        return gpa;
    }
    
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        KhaiBaoLopSv sv = new KhaiBaoLopSv(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextFloat());
        
        String dateStr = sv.getbirthDay().toString();
         SimpleDateFormat fm = new SimpleDateFormat("dd/MM/yyyy") ;
        Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dateStr);
      
        dateStr = fm.format(date);
        
        DecimalFormat d = new DecimalFormat("0.00");
        
        System.out.println(sv.id+" "+sv.getName()+" "+sv.getIdclass()+" "+dateStr+" "+d.format(sv.getGpa()));
        
        
    }
    
}
