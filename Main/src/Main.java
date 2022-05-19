
import java.io.*;
import java.util.*;
import main.SV1;
public class Main {
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        Scanner in=new Scanner(new File("SINHVIEN.in"));
         ArrayList<SV1> s=new ArrayList<>();
        int t=Integer.parseInt(in.nextLine());
        for(int i=1;i<=t;i++){
            String a=in.nextLine();
            String b=in.nextLine();
            String c=in.nextLine();
            String d=in.nextLine();
            SV1 p=new SV1(a,b,c,d);
            s.add(p);
        }
        for(SV1 i:s){
            System.out.println(i);
        }
    }
}
