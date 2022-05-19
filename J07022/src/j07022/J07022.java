package j07022;

import java.util.*;
import java.io.*;
public class J07022 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        ArrayList<String> AR = new ArrayList<>();
        
        while(sc.hasNext()){
            String s = sc.next();
            try{
               int  x = Integer.parseInt(s);
            }
            catch(NumberFormatException e){
                AR.add(s);
            }
        }
        Collections.sort(AR);
        for(String i:AR){
            System.out.print(i+" ");
        }
    }

    
    
}
