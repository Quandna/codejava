
package hungtest;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class danhsach implements Comparable <danhsach>{
    private String id, name, room;
    private Date firstdate, lastdate;
    private long time;
    public danhsach(int id, String name, String room,Date firstdate, Date lastdate){
        this.id = findId(id);
        this.name = name;
        this.room = room;
        this.firstdate = firstdate;
        this.lastdate = lastdate;
        this.time = lastdate.getTime() - firstdate.getTime() / (60*60*24*1000);
    }
    private String findId(int i){
        String ans = "KH";
        if(i<10) return ans + "0" + i;
        return ans + i; 
    }
    public long getTime(){
        return this.time;
    }
    @Override
    public int compareTo(danhsach o){
        if(this.time > o.getTime()) return -1;
        else if (this.time < o.getTime()) return 1;
        return 0;
    }
    @Override
    public String toString(){
        return this.id + " " + this.name + " " + this.room + " " + this.time;
    }

}
public class dslt {
    public static void main(String[] args) throws ParseException,FileNotFoundException {
        Scanner sc = new Scanner(new File("KHACH.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<danhsach> lst = new ArrayList<>();
        for(int i=1;i<=t;i++){
            String name = sc.nextLine();
            String room = sc.nextLine();
            Date firstdate =new SimpleDateFormat("dd/MM/yyyy").parse(sc.nextLine());
            Date lastdate = new SimpleDateFormat("dd/MM/yyyy").parse(sc.nextLine());
            lst.add(new danhsach(i, name, room, firstdate, lastdate));
        }
        Collections.sort(lst);
        for(danhsach x:lst) System.out.println(x);
        sc.close();
    }
}