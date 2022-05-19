package j05011;
import java.util.*;
import java.text.*;
public class TinhGio implements Comparable<TinhGio>{
    private String ma,ten;
    private Date giovao,giora;
    private long diff,diffMinutes,diffHours;
    public TinhGio(String ma,String ten,String giovao,String giora) throws ParseException{
        this.ma = ma;
        this.ten = ten;
        this.giovao = new SimpleDateFormat("HH:mm").parse(giovao);
        this.giora = new SimpleDateFormat("HH:mm").parse(giora);
        this.diff = tinhgio(giovao, giora);
        this.diffMinutes = diff/(60*1000)%60;
        this.diffHours = diff/(60*60*1000)%24;
    }
    
    private long tinhgio(String vao,String ra) throws ParseException{
        SimpleDateFormat format = new SimpleDateFormat("HH:mm");
        Date giovao = format.parse(vao);
        Date giora = format.parse(ra);
        long tgian = giora.getTime()-giovao.getTime();
        return tgian;
    }
    
    @Override
    public int compareTo(TinhGio o){
        if(this.diffHours == o.diffHours){
            if(this.diffMinutes == o.diffMinutes){
                return 0;
            }else return (this.diffMinutes > o.diffMinutes) ? -1:1;
        }else return (this.diffHours>o.diffHours) ?-1:1;
    }
    
    @Override
    public String toString(){
        return ma+" "+ten+" "+diffHours+" gio "+diffMinutes+" phut";
    }
}
