import java.util.*;
import java.text.*;
public class KhaiBaoLopNV {
    private String id = "00001";
    private String name;
    private String gt;
    private String day;
    private String address;
    private String msThue;
    private String daysign;

    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    
     public void setName(String name){
        this.name = name;
    }
    
    public String getDay(){
        return day;
    }
     public void setDay(String day){
        this.day = day;
    }
    
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getDaySign(){
        return daysign;
    }
    public void setDaySign(String daysign){
        this.daysign = daysign;
    }
    public String getGt(){
        return gt;
    }
    public void setGt(String gt){
        this.gt = gt;
    }
    public String getMsThue(){
        return msThue;
    }
    public void setMsThue(String msThue){
        this.msThue = msThue;
    }
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        KhaiBaoLopNV nv = new KhaiBaoLopNV();
        nv.setName(sc.nextLine());
        nv.setGt(sc.nextLine());
        nv.setDay(sc.nextLine());
        nv.setAddress(sc.nextLine());
        nv.setMsThue(sc.nextLine());
       nv.setDaySign(sc.nextLine());
        
        
        
        
        String dateStr = nv.getDaySign().toString();
        SimpleDateFormat fm = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dateStr);
        //fm = new SimpleDateFormat("dd/MM/yyyy");
        dateStr = fm.format(date);
    
        String birthday = nv.getDay().toString();
        Date date1 = new SimpleDateFormat("MM/dd/yyyy").parse(birthday);
        SimpleDateFormat fm1 = new SimpleDateFormat("MM/dd/yyyy");
        birthday = fm1.format(date1);
        
        
        System.out.println(nv.getId()+" "+nv.getName()+" "+nv.getGt()+" "+birthday+" "+nv.getAddress()+" "+nv.getMsThue()+" "+dateStr);
    }
    
}
