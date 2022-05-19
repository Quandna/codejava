package j07053;
import java.util.*;
import java.io.*;
import java.text.ParseException;
/**
 *
 * @author ADMIN
 */
public class J07053 {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Tinh> s=new ArrayList<>();
        Scanner in=new Scanner(new File("XETTUYEN.in"));
        int t=Integer.parseInt(in.nextLine());
        for(int i=1;i<=t;i++){
            Tinh p=new Tinh(i,in.nextLine(),in.nextLine(),in.nextFloat(),in.nextFloat());
            s.add(p);
            in.nextLine();
        }
        for(Tinh j:s){
            System.out.println(j);
        }
    }
    
}
