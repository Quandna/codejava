package sntmax;
import java.util.*;
import java.io.*;
import java.lang.*;
public class SNTmax {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,Integer> hm = new HashMap<>();
        ArrayList<Integer> ar = new ArrayList<>();
        while(sc.hasNextInt()){
           int n = sc.nextInt();
            if(check(n) ){
                if(hm.containsKey(n)) hm.put(n, hm.get(n)+1);
                else {
                    hm.put(n, 1);
                    ar.add(n);
                }
            }
        } 
            Collections.sort( ar,(Integer a, Integer b ) -> hm.get(b).compareTo(hm.get(a)));
            for(Integer i:ar){
                System.out.println(i+" "+ar.get(i));
            }

    }
    
    public static Boolean check(int n){
        String s =""+n;

        for(int i = 0;i< s.length()-1;i++){
            if(s.charAt(i)<s.charAt(i+1)) return false;
        }
        return true;
       
    } 
    public static int checkSnt(int n){
        if(n < 2) return 0;
        for(int i = 2;i<= Math.sqrt(n);i++){
            if(n%i==0) return 0;
        }
        return 1;
    }
}
