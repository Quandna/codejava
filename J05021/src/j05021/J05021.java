
package j05021;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class J05021 {

    public static void main(String[] args) {
        Scanner sc   = new Scanner(System.in);
        ArrayList<SV1> ds = new ArrayList<>();
        while(sc.hasNext()){
            String a= sc.nextLine();
            String b= sc.nextLine();
            String c= sc.nextLine();
            String d= sc.nextLine();
            SV1 p = new SV1(a,b,c,d);
            ds.add(p);  
            if(d.equals("exit")) {
                break;}
        }
        Collections.sort(ds);
        for(SV1 i:ds){
            System.out.println(i);
        }
    }
    
}
